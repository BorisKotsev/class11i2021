package edu.school.tests;

import java.awt.Color;

import edu.school.models.SvgCircle;
import edu.school.models.SvgEllipse;
import edu.school.models.SvgLine;
import edu.school.models.SvgPicture;
import edu.school.models.SvgPolygon;
import edu.school.models.SvgRectangle;

public class Test 
{
	public static void main(String[] args) 
	{
		SvgPicture pic = new SvgPicture();

		pic.add(new SvgLine(10, 10, 180, 250, Color.red, 5));
		pic.add(new SvgCircle(25, 75, 20, Color.blue, Color.yellow, 5));
		pic.add(new SvgEllipse(75, 75, 20, 5, Color.green, Color.yellow, 5));
		pic.add(new SvgRectangle(10, 10, 30, 30, Color.black, Color.black, 5));
		pic.add(new SvgPolygon(Color.green, Color.red, 5, 50, 160, 55, 180, 70, 180, 60, 190, 65, 205, 50, 195, 35, 205, 40, 190, 30, 180, 45, 180));
		
		//System.out.println(pic);

		pic.saveToFile("C:\\Users\\UEFI\\Documents\\test.svg");
	}
}
