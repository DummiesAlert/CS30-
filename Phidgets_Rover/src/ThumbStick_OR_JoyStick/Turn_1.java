package ThumbStick_OR_JoyStick;

//Add Phidgets Library
import com.phidget22.*;

public class Turn_1 {
public static void main(String[] args) throws Exception{

    //Connect to wireless rover
    Net.addServer("", "192.168.100.1", 5661, "", 0);

    //Create
    DCMotor leftMotors = new DCMotor();
    DCMotor rightMotors = new DCMotor();
    VoltageRatioInput vAxis = new VoltageRatioInput(); 
    VoltageRatioInput hAxis = new VoltageRatioInput(); 
    DistanceSensor sonar = new DistanceSensor();

    //Address
    leftMotors.setChannel(0);
    rightMotors.setChannel(1);
    vAxis.setChannel(0);
    hAxis.setChannel(1);

    //Open
    leftMotors.open(5000);
    rightMotors.open(5000);
    vAxis.open(5000);
    hAxis.open(5000);
    sonar.open(5000);
    sonar.setDataInterval(100);

    //Increase acceleration 
    leftMotors.setAcceleration(leftMotors.getMaxAcceleration());
    rightMotors.setAcceleration(rightMotors.getMaxAcceleration());

    //Use your Phidgets
    while(true){

  	  
        System.out.println("Distance: " + sonar.getDistance() + " mm");
        
        if (sonar.getDistance() < 200) {
            //Object detected! Stop motors
            leftMotors.setTargetVelocity(0);
            rightMotors.setTargetVelocity(0);
        } else {
            //Get data from vertical and horizontal axis (values between -1 and 1)
            double verticalAxis = vAxis.getVoltageRatio();
            double horizontalAxis = hAxis.getVoltageRatio();

            //Use thumbstick data to figure how each side of rover should move
            double leftMotorsSpeed = verticalAxis + horizontalAxis;
            double rightMotorsSpeed = verticalAxis - horizontalAxis;

            //Limit values to between -1 and 1
            if(leftMotorsSpeed > 1) leftMotorsSpeed = 1;
            if(leftMotorsSpeed < -1) leftMotorsSpeed = -1;
            if(rightMotorsSpeed > 1) rightMotorsSpeed = 1;
            if(rightMotorsSpeed < -1) rightMotorsSpeed = -1;

            //Apply values 
            leftMotors.setTargetVelocity(leftMotorsSpeed); 
            rightMotors.setTargetVelocity(rightMotorsSpeed);
        }
 

        //Wait for 100 milliseconds
        Thread.sleep(100);
    }
}
}