package org.usfirst.frc.team3647.robot;
import edu.wpi.first.wpilibj.Talon;
public class SideMotor {
	static Talon sideMotors= new Talon(3);
	static Talon sideMotors2= new Talon(6);
	
	public static void sideWheels(){
		
		if (Controllers.LeftBumper2)
		{
			sideMotors.set(.5);
			sideMotors2.set(-.5);
		}
		else if (Controllers.RightBumper2)
		{
			sideMotors.set(-1);
			sideMotors2.set(1);
		}
		else
		{
			sideMotors.set(0);
			sideMotors2.set(0);
		}
	}

}
