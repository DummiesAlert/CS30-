
//Add Phidgets Library
import com.phidget22.*;

public class PhidgetScale2_lb {
    public static void main(String[] args) throws Exception{

        //Create
        VoltageRatioInput scale = new VoltageRatioInput();
        
        //Open
        scale.open(1000);
        
        //Use your Offset Value
        double offsetValue = 2.4032779049143558E-5;
        
        //Use your Phidgets
        while(true){

            //Calculate Weight (kg)
            double weight = (4700 * (scale.getVoltageRatio() - offsetValue)) * 2.205;
            
            //Display Weight
            System.out.println(String.format("%.3f lb", weight));      
            
            Thread.sleep(250);
        }
    }    
}
  