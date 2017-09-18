package org.usfirst.frc.team3647.robot;

import edu.wpi.first.wpilibj.CameraServer;


public class Camera {
	public static void USBCamInit(){
	CameraServer server = CameraServer.getInstance();

	server.setQuality(50);

	server.startAutomaticCapture("cam3");
	
	}

}