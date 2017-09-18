package org.usfirst.frc.team3647.robot;
import edu.wpi.first.wpilibj.Talon;
public class TrashCanLifter {
	static Talon lifter = new Talon(8);
	public static void Lifters(){
		if(Controllers.RTButton > 0){
			lifter.set(Controllers.RTButton);
		}
		else if(Controllers.LTButton > 0){
			lifter.set(-Controllers.LTButton);
		}
		else{
			lifter.set(0);
		}
	}
}
