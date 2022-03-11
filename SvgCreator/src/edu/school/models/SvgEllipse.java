package edu.school.models;

import java.awt.Color;

public class SvgEllipse extends SvgFillObject
{
    private int rX;
    private int rY;

    public SvgEllipse(int cX, int cY, int rX, int rY, Color strokeColor, Color fillColor, int strokeWidth)
	{
		super(cX, cY, strokeColor, strokeWidth, fillColor);
        setRX(rX);
        setRY(rY);
	}

    public int getRX() 
    {
        return this.rX;
    }

    public void setRX(int rX) 
    {
        this.rX = rX;
    }

    public int getRY() 
    {
        return this.rY;
    }

    public void setRY(int rY) 
    {
        this.rY = rY;
    }

    public String toSvgCode() 
	{
		String result = "<ellipse ";
		result += "cx=\"" + getX() + "\" cy=\"" + getY() + "\" ";
        result += "rx=\"" + getRX() + "\" ry=\"" + getRY() + "\" ";
        result += "stroke=\"" + toRGB(getColor()) + "\" ";
        result += "fill=\"" + toRGB(getFillColor()) + "\" ";
		result += "stroke-width=\"" + getStrokeWidth() + "\"/>";
		
        return result;
	}
}