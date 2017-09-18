package org.usfirst.frc.team3647.robot;
import edu.wpi.first.wpilibj.Talon;
public class TrashCanRoller {
	static Talon trashroller= new Talon(9);
	
	public static void roller(){
		
		if (Controllers.YButton1)
		{
			trashroller.set(.67);
		}
	
	else if (Controllers.AButton1)
	{
			trashroller.set(-1);
	}
	
	else {
		trashroller.set(0);
	}
	
	}
}



