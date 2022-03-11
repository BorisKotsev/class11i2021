package edu.school.tests;

import javax.swing.JFrame;

import edu.school.models.SvgPicture;
import edu.school.models.SvgPolygon;
import edu.school.views.PointsPanel;
import java.awt.Color;

public class PointsPanelTest 
{
	public static void main(String[] args) 
	{
		JFrame window = new JFrame("GUI App");
		window.setBounds(200, 200, 500, 750);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);
		window.setLayout(null);
		
		PointsPanel p = new PointsPanel();
		p.setBounds(10, 10, 200, 200);
		window.add(p);

		SvgPicture pic = new SvgPicture();

		if(!p.canPlace)
		{
			pic.add(new SvgPolygon(Color.green, Color.red, 5, p.points));

			pic.saveToFile("C:\\Users\\Boris\\Documentstest.svg");
		}

		// DA SE DOBAVI BUTON ZA ZAPAZVANE
	}
}
