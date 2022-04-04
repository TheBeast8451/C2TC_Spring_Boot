package com.tns.di;

public class Student 
{
//	MathCheat chit = new MathCheat();
	
	private MathCheat chit;
	
	public void setChit(MathCheat chit) // Using setters
	{
		this.chit = chit;
	}

	void cheating()
	{
		chit.mathCheat(); // Some other class
	}
}
