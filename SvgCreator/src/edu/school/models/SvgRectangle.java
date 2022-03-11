package edu.school.models;

import java.awt.Color;

public class SvgRectangle extends SvgFillObject
{
    private int width;
    private int height;

    public SvgRectangle(int x, int y, int width, int height, Color strokeColor, Color fillColor, int strokeWidth)
	{
		super(x, y, strokeColor, strokeWidth, fillColor);
        setWidth(width);
        setHeight(height);
	}

    public int getWidth() 
    {
        return this.width;
    }

    public void setWidth(int width) 
    {
        this.width = width;
    }

    public int getHeight() 
    {
        return this.height;
    }

    public void setHeight(int height) 
    {
        this.height = height;
    }

    public String toSvgCode() 
    {
        String result = "<rect ";
		result += "x=\"" + getX() + "\" y=\"" + getY() + "\" ";
        result += "width=\"" + getWidth() + "\" height=\"" + getHeight() + "\" ";
        result += "stroke=\"" + toRGB(getColor()) + "\" ";
        result += "fill=\"" + toRGB(getFillColor()) + "\" ";
		result += "stroke-width=\"" + getStrokeWidth() + "\"/>";
	
        return result;
    }   
}
