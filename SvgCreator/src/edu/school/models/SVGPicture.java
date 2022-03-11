package edu.school.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SvgPicture 
{
	private SvgObject[] objects;
	private int index;
	
	public SvgPicture()
	{
		objects = new SvgObject[20];
		index = 0;
	}
	
	public void add(SvgObject object)
	{
		if(object == null)
			return;
		
		if(index >= objects.length)
		{
			//extend the array of objects
		}

		objects[index ++] = object;
	}
	
	public String toString()
	{
		String result = "<svg xmlns=\"http://www.w3.org/2000/svg\" viewBox=\"0 0 500 500\"> \n";

		for(int i = 0; i < index; i++)
		{
			result += objects[i].toSvgCode() + "\n";
		}

		result += "</svg>";

		return result;
	}

	public void saveToFile(String filePath)
	{
		try
		{
			Files.writeString(Paths.get(filePath), toString(), StandardOpenOption.CREATE_NEW);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
