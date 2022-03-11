package edu.school.models;

import java.awt.Color;

public class SvgCircle extends SvgFillObject
{
    private int r;

    public SvgCircle(int cX, int cY, int r, Color strokeColor, Color fillColor, int strokeWidth)
	{
		super(cX, cY, strokeColor, strokeWidth, fillColor);
        setR(r);
	}

    public int getR() 
    {
        return this.r;
    }

    public void setR(int r) 
    {
        this.r = r;
    }

    public String toSvgCode() 
	{
		String result = "<circle ";
		result += "cx=\"" + getX() + "\" cy=\"" + getY() + "\" ";
        result += "r=\"" + getR() + "\" ";
        result += "stroke=\"" + toRGB(getColor())+ "\" ";
        result += "fill=\"" + toRGB(getFillColor()) + "\" ";
		result += "stroke-width=\"" + getStrokeWidth() + "\"/>";
		
        return result;
	}
}
