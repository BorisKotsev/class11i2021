package edu.school.tests;

import javax.swing.JButton;
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
		
		JButton undo = new JButton("Undo");
		undo.setBounds(0, 300, 150, 60);
		window.add(undo);
		
		JButton redo = new JButton("Redo");
		redo.setBounds(150, 300, 150, 60);
		window.add(redo);
	}
}
