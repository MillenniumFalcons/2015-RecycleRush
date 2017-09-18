package org.usfirst.frc.team3647.robot;


import edu.wpi.first.wpilibj.Joystick;
public class Controllers {
	static Joystick driverJoystickZero=new Joystick(0);
	static Joystick driverJoystickOne=new Joystick(1);
	public static double JoystickLeft = 0;
	public static double JoystickRight = 0;
	public static double JoystickRightX = 0;

	public static boolean AButton2=false;
	public static boolean YButton2=false;
	public static boolean RightBumper1= false;
	public static boolean LeftBumper1=false;
	public static boolean XButton2=false;
	public static boolean RightBumper2=false;
	public static boolean LeftBumper2=false;
	public static boolean BButton2=false;
	public static boolean AButton1=false;
	public static boolean YButton1=false;
	
	public static double RTButton=0;
	public static double LTButton=0;
	
	
	
	public static void getJoystick(){
		JoystickLeft = driverJoystickZero.getRawAxis(1);
		JoystickRight = driverJoystickZero.getRawAxis(5);
		JoystickRightX = driverJoystickZero.getRawAxis(4);
		RightBumper1 = driverJoystickZero.getRawButton(6);
		LeftBumper1 = driverJoystickZero.getRawButton(5);
		AButton1 = driverJoystickZero.getRawButton(1);
		YButton1 = driverJoystickZero.getRawButton(4);
		
		YButton2 = driverJoystickOne.getRawButton(1);
		AButton2 = driverJoystickOne.getRawButton(4);
		RightBumper2 = driverJoystickOne.getRawButton(6);
		LeftBumper2 = driverJoystickOne.getRawButton(5);
		XButton2 = driverJoystickOne.getRawButton(3);
		RTButton = driverJoystickOne.getRawAxis(3);
		LTButton = driverJoystickOne.getRawAxis(2);
		BButton2 = driverJoystickOne.getRawButton(2);
		
	}
}
