package edu.school.models;

import java.awt.Color;

public abstract class SvgObject 
{
	private int x;
	private int y;
	private int strokeWidth;
	private Color color;
	
	public SvgObject(int x, int y, Color color, int strokeWidth)
	{
		setX(x);
		setY(y);
		setColor(color);
		setStrokeWidth(strokeWidth);
	}
	
	public SvgObject(int x, int y)
	{
		this(x, y, Color.BLACK, 5);
	}

	public SvgObject(Color color, int strokeWidth)
	{
		setColor(color);
		setStrokeWidth(strokeWidth);
	}
	
	public SvgObject()
	{
		this(0, 0);
	}

	public int getX() 
	{
		return x;
	}

	public void setX(int x) 
	{
		this.x = x;
	}

	public int getY() 
	{
		return y;
	}

	public void setY(int y) 
	{
		this.y = y;
	}

	public Color getColor() 
	{
		return color;
	}

	public void setColor(Color color) 
	{
		this.color = color;
	}

	public int getStrokeWidth() 
	{
		return this.strokeWidth;
	}

	public void setStrokeWidth(int strokeWidth) 
	{
		this.strokeWidth = strokeWidth;
	}
	
	public abstract String toSvgCode();
	
	protected String toRGB(Color color)
	{
		if(color == null)
			return "";

		String result = "rgb(";
		result += color.getRed() + ",";
		result += color.getGreen() + ",";
		result += color.getBlue() + ")";
		
		return result;
	}
}