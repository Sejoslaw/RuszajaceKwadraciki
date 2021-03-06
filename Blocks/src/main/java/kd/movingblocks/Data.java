package main.java.kd.movingblocks;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Basic informations about Moving Blocks itself.
 * 
 * @author <a href="mailto:k.dobrzynski94@gmail.com">Krzysztof Dobrzyński</a> -> https://github.com/Sejoslaw
 */
public class Data
{
	/**
	 * Current version of Moving Blocks - Last build time.
	 */
	public static final String VERSION = "2017.04.28-13.49.12";
	
	public static final Logger LOGGER = Logger.getLogger("MovingBlocks");
	
	/**
	 * Add log using Moving Blocks logger.
	 */
	public static void log(Level level, String message)
	{
		LOGGER.log(level, message);
	}
}
