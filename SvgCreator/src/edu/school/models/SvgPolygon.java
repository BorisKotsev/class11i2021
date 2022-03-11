package edu.school.models;
import java.awt.Color;

public class SvgPolygon extends SvgFillObject
{
    private double points[];

    public SvgPolygon(Color strokeColor, Color fillColor, int strokeWidth, double... points)
	{
		super(strokeColor, strokeWidth, fillColor);
        setPoints(points); 
	}

    public double[] getPoints() 
    {
        return this.points;
    }

    public void setPoints(double points[]) 
    {
        if(points.length % 2 == 1)
        {
            throw new IllegalArgumentException("The size should be even");
        }

        this.points = points;
    }

    public String toSvgCode() 
	{
        String pointsStr = "";

        for(int i = 0; i < points.length; i ++)
        {
            pointsStr += points[i] + " ";
        }

		String result = "<polygon ";
		result += "points=\"" + pointsStr + "\" ";
        result += "stroke=\"" + toRGB(getColor())+ "\" ";
        result += "fill=\"" + toRGB(getFillColor()) + "\" ";
		result += "stroke-width=\"" + getStrokeWidth() + "\"/>";
		
        return result;
	}
}

