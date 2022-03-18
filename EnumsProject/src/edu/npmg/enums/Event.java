package edu.npmg.enums;

public class Event 
{
	private String description;
	private DayOfWeek eventsDay;
	
	public Event(String description, DayOfWeek eventsDay)
	{
		setDescription(description);
		this.eventsDay = eventsDay;
	}
	
	public void setDescription(String description)
	{
		if(description != null && !description.isEmpty())
		{
			this.description = description;
		}
	}
	
	public String getDescription()
	{
		return description;
	}
	
	public DayOfWeek getEventsDay()
	{
		return eventsDay;
	}
	
	public String toString()
	{
		return String.format("%s - %s", getDescription(), getEventsDay());
	}
}
