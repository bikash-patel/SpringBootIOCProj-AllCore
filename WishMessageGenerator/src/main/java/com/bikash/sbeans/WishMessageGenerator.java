package com.bikash.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //it will take class name start with lower case as bean id
@Scope("prototype")
public class WishMessageGenerator {
	
	@Autowired
	private LocalTime lt;
	
	private WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator.WishMessageGenerator() : 0-arg constructor");
	}
	public String getMessage(String userName)
	{
		//Business Logic
		return null;
	}
}
