package edu.school.calendar;

public class Event 
{	
	private Date date;
	private Time startTime;
	private Time endTime;
	private String description;
	
	public void setDate(Date date) 
	{
		if(date != null) 
		{
			this.date = date;
		}
	}
	
	public void setStartTime(Time startTime) 
	{
		if(startTime != null) 
		{
			this.startTime = startTime;
		}
	}

	public void setEndTime(Time endTime) 
	{
		if(endTime != null) 
		{
			this.endTime = endTime;
		}
	}

	public void setDescription(String description) 
	{
		if(description.isEmpty() || description != null) 
		{
			this.description = description;
		}
	}
	
	public Date getDate() 
	{
		return date;
	}

	public Time getStartTime() 
	{
		return startTime;
	}

	public Time getEndTime() 
	{
		return endTime;
	}

	public String getDescription() 
	{
		return description;
	}
	
	public Event(Date date, Time startTime, Time endTime, String description) 
	{
		setDate(date);
		setStartTime(startTime);
		setEndTime(endTime);
		setDescription(description);
	}
	
	public Event(Date date, String description) 
	{
		setDate(date);
		setDescription(description);
		
		Time time = new Time(0, 0, 0);
		setStartTime(time);
		
		Time time2 = new Time(23, 59, 59);
		setEndTime(time2);
	}
	
	public String toString() 
	{
		String dateDescription = date.toString();
		String startTimeDescription = startTime.toString();
		String endTimeDescription = endTime.toString();
		
		return String.format("%s, %s, %s, %s", dateDescription, startTimeDescription, endTimeDescription, getDescription());
	}
}
