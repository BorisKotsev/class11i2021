package edu.school.models;

import java.awt.Color;

public abstract class SvgFillObject extends SvgObject
{
	private Color fillColor;

	public SvgFillObject(int x, int y, Color color, int strokeWidth, Color fillColor)
	{
		super(x, y, color, strokeWidth);
        setFillColor(fillColor);
	}

    public SvgFillObject(Color color, int strokeWidth, Color fillColor)
	{
		super(color, strokeWidth);
        setFillColor(fillColor);
	}

    public Color getFillColor() 
    {
        return this.fillColor;
    }

    public void setFillColor(Color fillColor) 
    {
        this.fillColor = fillColor;
    }
}
