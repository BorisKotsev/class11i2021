package edu.school.calendar;

public class Time 
{
    private int hour;
    private int second;
    private int minute;

    public void setHour(int hourValue)
    {
        if(hourValue >= 0 && hourValue < 24)
        {
            hour = hourValue;
        }
    }

    public void setMinute(int minuteValue)
    {
        if(minuteValue >= 0 && minuteValue < 60)
        {
            minute = minuteValue;
        }
    }

    public void setSecond(int secondValue)
    {
        if(secondValue >= 0 && secondValue < 60)
        {
            second = secondValue;
        }
    }

    public int getHour()
    {
        return hour;
    }

    public int getMinute()
    {
        return minute;
    }

    public int getSecond()
    {
        return second;
    }

    public Time(int hour, int minute, int second)
    {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public Time()
    {
        setHour(0);
        setMinute(0);
        setSecond(0);
    }

    public String toString()
    {
        String res = "";

        if(getHour() < 10)
        {
            res += "0" + getHour() + ":";
        }
        else
        {
        	res += getHour() + ":";
        }
        if(getMinute() < 10)
        {
            res += "0" + getMinute() + ":";
        }
        else
        {
        	res += getMinute() + ":";
        }
        if(getSecond() < 10)
        {
            res += "0" + getSecond();
        }
        else
        {
        	res += getSecond();
        }

        return res;
    }

    public void increaseSecond()
    {
        if(getSecond() == 59)
        {
            setSecond(0);
 
            if(getMinute() == 59)
            {
                setMinute(0);

                if(getHour() == 23)
                {
                    setHour(0);
                }
                else
                {
                    setHour(getHour() + 1);
                }
            }
            else
            {
                setMinute(getMinute() + 1);
            }
        }
        else
        {
            setSecond(getSecond() + 1);
        }
    }
}
