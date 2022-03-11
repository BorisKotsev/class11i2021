package edu.school.models;

import java.awt.Color;

public class SvgLine extends SvgObject
{
	private int endX;
	private int endY;
	
	public SvgLine(int startX, int startY, int endX, int endY, Color strokeColor, int strokeWidth)
	{
		super(startX, startY, strokeColor, strokeWidth);
		setEndX(endX);
		setEndY(endY);
	}
	
	public int getEndX() 
	{
		return endX;
	}

	public void setEndX(int endX) 
	{
		this.endX = endX;
	}

	public int getEndY()
	{
		return endY;
	}

	public void setEndY(int endY) 
	{
		this.endY = endY;
	}

	public String toSvgCode() 
	{
		String result = "<line ";
		result += "x1=\"" + getX() + "\" y1=\"" + getY() + "\" ";
		result += "x2=\"" + getEndX() + "\" y2=\"" + getEndY() + "\" ";
		result += "stroke=\"" + toRGB(getColor()) + "\" ";
		result += "stroke-width=\"" + getStrokeWidth() + "\"/>";
			
		return result;
	}
}
