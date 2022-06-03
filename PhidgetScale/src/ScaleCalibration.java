
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
  
//0.024kg Wrapped Around Wire
//0.021kg Wrapped In Hole
//Item #1: Graphing Calculator 0.277 kg

/*

Run #1: (0.780 kg) 

Make Sure NOTHING is on Your Scale and Press Enter

Averaging Value...
Place a Known Weight on the Scale, Type the Weight in Kilograms and Press Enter
0.012
Averaging Value... 
Your new slope value is: 4839

Run #2: (5 kg)

Make Sure NOTHING is on Your Scale and Press Enter

Averaging Value...
Place a Known Weight on the Scale, Type the Weight in Kilograms and Press Enter
0.021
Averaging Value...
Your new slope value is: 4846

Run #3: (25 kg)

Make Sure NOTHING is on Your Scale and Press Enter

Averaging Value...
Place a Known Weight on the Scale, Type the Weight in Kilograms and Press Enter
????
Averaging Value...
Your new slope value is: ?????

*/