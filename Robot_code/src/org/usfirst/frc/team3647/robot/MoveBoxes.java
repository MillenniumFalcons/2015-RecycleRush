package org.usfirst.frc.team3647.robot;

import edu.wpi.first.wpilibj.Talon;



public class MoveBoxes {
	static Talon conBelt= new Talon(5);
	//static Talon sideMotors12= new Talon(3);
	//static Talon sideMotors123= new Talon(6);
	
	public static void conMotor(){
		if (Controllers.YButton2)
		{
			conBelt.set(.35);
			SideMotor.sideMotors.set(.375);
			SideMotor.sideMotors2.set(-.25);
		}
		else if (Controllers.AButton2)
		{
			conBelt.set(-1);
			SideMotor.sideMotors.set(-1);
			SideMotor.sideMotors2.set(1);
		}
		/*else if(Controllers.BButton2)
		{
			conBelt.set(-.7);
			SideMotor.sideMotors.set(-.7);
			SideMotor.sideMotors2.set(.7);
		} */
		else
		{
			conBelt.set(0);
			SideMotor.sideMotors.set(0);
			SideMotor.sideMotors2.set(0);
		}
	}
}
