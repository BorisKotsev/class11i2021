package edu.npmg.enums;

public enum DayOfWeek {
	MONDAY(1, "����������"),
	TUESDAY(2, "�������"),
	WEDNESDAY(3, "�����"),
	THURSDAY(4, "���������"),
	FRIDAY(5, "�����"),
	SATURDAY(6, "������"),
	SUNDAY(7, "������");
	
	private int dayNumber;
	private String bgName;
	
	private DayOfWeek(int dayNumber, String bgName)
	{
		this.dayNumber = dayNumber;
		this.bgName = bgName;
	}
	
	public String toString()
	{
		return String.format("%s", bgName);
	}
}
