package edu.npmg.fractions;

public class Fraction 
{
	private int numerator;
	private int denominator;
	
	public void setNumerator(int numerator)
	{
		this.numerator = numerator;
	}
	
	public void setDenominator(int denominatorValue)
	{
		if(denominatorValue != 0)
		{
			denominator = denominatorValue;
		}
		else
		{
			denominator = 1;
		}
	}
	
	public int getNumerator()
	{
		return numerator;
	}
	
	public int getDenominator()
	{
		return denominator;
	}
	
	public String toString()
	{
		return String.format("%d / %d", getNumerator(), getDenominator());
	}
	
	public Fraction(int numerator, int denominator)
	{
		setNumerator(numerator);
		setDenominator(denominator);
	}
	
	public Fraction(int numerator)
	{
		this(numerator, 1);
	}
	
	public Fraction()
	{
		this(0, 1);
	}
	
	public Fraction add(Fraction f)
	{
		int newNumerator = getNumerator()*f.getDenominator() +
				getDenominator()*f.getNumerator();
		int newDenominator = getDenominator()*f.getDenominator();
		
		return new Fraction(newNumerator, newDenominator);
		
	}
	
	public void reduce()
	{
		int min = getNumerator();

		if(min > getDenominator())
			min = getDenominator();

		for(int i = min; i >= 2; i --)
		{
			if(getNumerator() % i == 0 && 
					getDenominator() % i == 0)
			{
				setNumerator(getNumerator() / i);
				setDenominator(getDenominator() / i);
			}
		}
 	}
	
	public Fraction findReducedFraction()
	{
		Fraction result = 
				new Fraction(getNumerator(), getDenominator());
		result.reduce();

		return result;
	}	
}
