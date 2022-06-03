
//Add Phidgets Library
import com.phidget22.*;

public class PhidgetScale2_kg {
    public static void main(String[] args) throws Exception{

        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
         
        //Use your Offset Value
        double offsetValue = 3.530131654595086E-5;
        
        //Use your Phidgets
        while(true){

            //Calculate Weight (kg) 
            double weight = (4700 * (scale.getVoltageRatio() - offsetValue));
            
            //Display Weight
            System.out.println(String.format("%.3f kg", weight));      
            
            Thread.sleep(250);
        }
    }    
}