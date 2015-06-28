package org.szkiler.dp.server;

import org.openimaj.image.DisplayUtilities;
import org.openimaj.video.gstreamer.GStreamerVideo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        GStreamerVideo stream = new GStreamerVideo("play");
        DisplayUtilities.display(stream.getCurrentFrame());
    }
    
}
