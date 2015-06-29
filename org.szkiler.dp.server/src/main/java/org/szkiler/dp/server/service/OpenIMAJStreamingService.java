package org.szkiler.dp.server.service;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import org.openimaj.image.DisplayUtilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.szkiler.dp.core.service.StreamingService;

public class OpenIMAJStreamingService implements StreamingService{

	private final static Logger logger = LoggerFactory.getLogger(OpenIMAJStreamingService.class);
	
	public void stream() {
		
		logger.info("streaming");
		//GStreamerVideo video = new GStreamerVideo("videosink");
		Robot robot;
		try {
			robot = new Robot();
			BufferedImage screenShot = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
			
			DisplayUtilities.display(screenShot);
			} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
	}

}
