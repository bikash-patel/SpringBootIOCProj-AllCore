package com.bikash.ston;

public class Printer {
	private static Printer PRINT;
	
	private Printer()
	{
		System.out.println("Printer.Printer() : 0-arg constructor");
	}
	public static final Printer getInstance()
	{
		if(PRINT==null)
			PRINT= new Printer();
		return PRINT;
	}
}
