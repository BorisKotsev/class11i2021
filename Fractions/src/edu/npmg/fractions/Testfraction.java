package edu.npmg.fractions;

public class Testfraction 
{
	public static void main(String[] args) 
	{
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(5);
		Fraction f3 = new Fraction(18, 21);
				
		Fraction f5 = f3.findReducedFraction();
		
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f5);

		Fraction f4 = f2.add(f3);

		System.out.println(f4);
	}
}
