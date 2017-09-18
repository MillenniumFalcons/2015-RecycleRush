package org.usfirst.frc.team3647.robot;

import edu.wpi.first.wpilibj.CameraServer;

public class Sensors {
	
	public static void USBCamInit(){//i put this in robotInit b/c it doesn't work otherwise
		CameraServer cam;
		cam = CameraServer.getInstance();
        cam.setQuality(25);
        //the camera name (ex "cam0") can be found through the roborio web interface
        cam.startAutomaticCapture("cam0");
		
		
	}

}
