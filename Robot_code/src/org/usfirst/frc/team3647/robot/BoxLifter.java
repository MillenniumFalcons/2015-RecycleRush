package org.usfirst.frc.team3647.robot;
import edu.wpi.first.wpilibj.Talon;


public class BoxLifter {
	static Talon lifter1 =new Talon (7);
	static Talon lifter2 =new Talon (4);
	
	
	public static void liftBox()
	{
		if(Controllers.LeftBumper1)
		{
			lifter1.set(-1);
			lifter2.set(-.95);
		}
		else if(Controllers.RightBumper1)
		{
			lifter1.set(1);
			lifter2.set(.95);
		}
		else
		{
			lifter2.set(0);
			lifter1.set(0);
		}
	}

}
