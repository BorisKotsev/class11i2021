package edu.school.calendar.test;



import edu.school.calendar.Date;
import edu.school.calendar.DayOfWeek;
import edu.school.calendar.Event;
import edu.school.calendar.Time;

public class Test 
{
    public static void main(String ards[])
    {
        Date d1 = new Date(28, 11, 2021);
        DayOfWeek current = d1.getDayOfWeek();

        Time sTime = new Time(13, 30, 0);
        Time eTime = new Time(16, 30, 0);

        Event event1 = new Event(d1, sTime, eTime, "Piano Lesson");

        System.out.println(event1);

        Date d2 = new Date(15, 05, 2021);
        Event event2 = new Event(d2, "Anne's birthday");
        
        System.out.println(event2);
    }
}
