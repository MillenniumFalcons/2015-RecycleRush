package org.usfirst.frc.team3646.robot;

import edu.wpi.first.wpilibj.Joystick;



public class Controlls 
{
	
	static Joystick TrialJoyZero = new Joystick(0);
	
	public static double JoystickXAxis = 0;
	public static double JoystickYAxis = 0;
	
	// is trigger on joystick
	public static boolean AnythingElse = false;
	
	public static void getJoystick()
	{
	
		
		JoystickXAxis = TrialJoyZero.getRawAxis(0);
		JoystickYAxis = TrialJoyZero.getRawAxis(1);
		
		AnythingElse = TrialJoyZero.getRawButton(1);
	
		
	}
	
	
}

	
	

