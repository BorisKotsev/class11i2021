package edu.school.calendar;

public class Date 
{
	private int day;
	private int month;
	private int year;
	
	public void setDay(int dayValue) 
	{
		if(dayValue > 0 && dayValue < 32) 
		{
			day = dayValue;
		}
	}
	
	public void setMonth(int monthValue) 
	{
		if(monthValue > 0 && monthValue < 13) 
		{
			month = monthValue;
		}
	}
	
	public void setYear(int yearValue) 
	{
		if(yearValue > 0) 
		{
			year = yearValue;
		}
	}
	
	public int getDay() 
	{
		return day;
	}
	
	public int getMonth() 
	{
		return month;
	}
	
	public int getYear() 
	{
		return year;
	}
	
	public Date(int dayValue, int monthValue, int yearValue) 
	{
		setDay(dayValue);
		setMonth(monthValue);
		setYear(yearValue);
	}
	
	public String toString() 
	{
		String res = "";
		
		res += "0" + getDay();
		
		if(getMonth() < 10) 
		{
			res += "0" + getMonth();
		}
		else 
		{
			res += getMonth();
		}
		
		if(getYear() < 10) 
		{
			res+= "000" + getYear();
		}
		else if(getYear() < 100 &&  getYear() > 9) 
		{
			res += "00" + getYear();
		}
		else if(getYear() < 1000 && getYear() > 99) 
		{
			res += "0" + getYear();
		}
		else 
		{
			res += getYear();
		}
		
		return res;
	}
		
	public DayOfWeek getDayOfWeek() 
	{
		if(getMonth() == 11 && getYear() == 2021 && getDay() % 7 == 1) 
		{
			return DayOfWeek.MONDAY;
		}
		else if(getMonth() == 11 && getYear() == 2021 && getDay() % 7 == 2) 
		{
			return DayOfWeek.TUESDAY;
		}
		else if(getMonth() == 11 && getYear() == 2021 && getDay() % 7 == 3) 
		{
			return DayOfWeek.WEDNESDAY;
		}
		else if(getMonth() == 11 && getYear() == 2021 && getDay() % 7 == 4) 
		{
			return DayOfWeek.THURSDAY;
		}
		else if(getMonth() == 11 && getYear() == 2021 && getDay() % 7 == 5) 
		{
			return DayOfWeek.FRIDAY;
		}
		else if(getMonth() == 11 && getYear() == 2021 && getDay() % 7 == 6) 
		{
			return DayOfWeek.SATURDAY;
		}
		else if(getMonth() == 11 && getYear() == 2021 && getDay() % 7 == 0) 
		{
			return DayOfWeek.SUNDAY;
		}

		return null;
	}
}
