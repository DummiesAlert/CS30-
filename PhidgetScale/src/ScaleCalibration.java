
// Purpose: Modify your program so the offset is automatically calculated when the program boots. It should be calculated at the beginning of your program, and average 64 samples. While averaging, it should print "Calculating Offset" to the user.

//Add Phidgets Library
import com.phidget22.*;
import java.util.Scanner;

public class ScaleCalibration {
    //Define
    static VoltageRatioInput scale;
    
    public static double getAverage()throws Exception{
        double average = 0;
        int count = 0;
        System.out.println("Averaging Value...");
        while(count < 64){
            average += scale.getVoltageRatio();
            count += 1;
            Thread.sleep(20);
        }
        return average/count;
    }
    
    public static void main(String[] args) throws Exception{
        try (Scanner scan = new Scanner(System.in)) {
			//Create
			scale = new VoltageRatioInput();
			
			//Open
			scale.open(1000);
			
			//Set data interval to minimum 
			scale.setDataInterval(scale.getMinDataInterval());
			
			System.out.println("Make Sure NOTHING is on Your Scale and Press Enter");
			scan.nextLine();
			double offset = getAverage();
			
			System.out.println("Place a Known Weight on the Scale, Type the Weight in Kilograms and Press Enter");
			double knownWeight = Double.parseDouble(scan.nextLine());
			
			double measuredWeight = getAverage();
			
			double slope = knownWeight / (measuredWeight - offset);
			
			System.out.println("Your new slope value is: " + Math.round(slope));
		}
    }    
} 
  
 
/*

Item #1.5: Zac Phone 0.202kg
Item #2: Alisha Phone 0.204 kg
Item #3: My Calculator 0.203kg

Run #1: (25 kg) Item #3

Make Sure NOTHING is on Your Scale and Press Enter

Averaging Value...
Place a Known Weight on the Scale, Type the Weight in Kilograms and Press Enter
0.203
Averaging Value...
Your new slope value is: 24293

Run #2: (25 kg) Item #2

Make Sure NOTHING is on Your Scale and Press Enter

Averaging Value...
Place a Known Weight on the Scale, Type the Weight in Kilograms and Press Enter
0.204
Averaging Value...
Your new slope value is: 24302


Run #3: (25 kg) Item #1.5

Make Sure NOTHING is on Your Scale and Press Enter

Averaging Value...
Place a Known Weight on the Scale, Type the Weight in Kilograms and Press Enter
0.202
Averaging Value...
Your new slope value is: 24418


*/