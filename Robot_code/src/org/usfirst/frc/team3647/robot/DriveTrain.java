package org.usfirst.frc.team3647.robot;
//import org.usfirst.frc.team3648.robot.Joysticks;

import edu.wpi.first.wpilibj.Talon;
public class DriveTrain {
	static Talon leftMotors = new Talon(0);
	static Talon rightMotors = new Talon(1);
	
	public static void TankDrive(){
		
		leftMotors.set(-.3*Controllers.JoystickLeft);
		//LeftMotor is flipped
		rightMotors.set(.3*Controllers.JoystickRight);
		
	}
	public static void ArcadeDrive()
    {
        double Speed = Controllers.JoystickLeft *.4;
        double Turn = Controllers.JoystickRightX *.4;

		    if(Turn>-.036 && Turn <.036)
		    {
		        leftMotors.set(-Speed);
		        rightMotors.set(Speed);
		    }
		    
		    //move and turn 
		    else if (Turn != 0 && (Speed > .0316 || Speed < -.0316))
		    {
		        
		        leftMotors.set(-Speed + Turn);
		        rightMotors.set(Speed + Turn);
		    }
		
		    else if (Turn != 0 && (Speed < .0316 || Speed > -.0316))
		    {
		        leftMotors.set(Turn);
		        rightMotors.set(Turn);
		    }
        }
}

