package com.bikash.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Journey {
	@Autowired
	@Qualifier("engineType")
	private IEngine eng;
	public void journey(String source,String dest)
	{
		System.out.println("==========================================================");
		System.out.println("Journey started from "+source);
		eng.engineStart();
		System.out.println("Journey completed to "+dest);
	}
}
