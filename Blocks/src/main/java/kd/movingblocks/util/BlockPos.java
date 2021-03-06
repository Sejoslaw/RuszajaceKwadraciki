package main.java.kd.movingblocks.util;

import java.util.Random;

import main.java.kd.movingblocks.Settings;

/**
 * Represents a single position in World.
 * 
 * @author <a href="mailto:k.dobrzynski94@gmail.com">Krzysztof Dobrzyński</a> -> https://github.com/Sejoslaw
 */
public class BlockPos 
{
	/**
	 * X and Y coordinate of a single block position.
	 */
	private final int _posX, _posY;
	
	public BlockPos(int posX, int posY)
	{
		this._posX = posX;
		this._posY = posY;
	}
	
	/**
	 * @return Returns position on X-coordinate.
	 */
	public int getX()
	{
		return this._posX;
	}
	
	/**
	 * @return Returns position on Y-coordinate.
	 */
	public int getY()
	{
		return this._posY;
	}
	
	/**
	 * @param pos
	 * 
	 * @return Returns true if the X and Y coordinates are the same.
	 */
	public boolean equals(BlockPos pos)
	{
		if (this._posX == pos._posX)
			if (this._posY == pos._posY)
				return true;
		return false;
	}
	
	public String toString()
	{
		return "BlockPos" + getX() + ", Y=" + getY() + "]";
	}
	
	//============================ ..:: Static ::.. ============================
	
	/**
	 * @return Returns random X or Y coordinate inside World.
	 */
	public static int getRandomCoord()
	{
		return new Random().nextInt(Settings.BLOCKS_IN_ROW - 2) + 1;
	}
}