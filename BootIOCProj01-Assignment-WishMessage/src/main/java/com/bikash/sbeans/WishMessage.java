package com.bikash.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WishMessage {
	
	@Autowired
	private LocalTime ld;
	public String getMessage(String user)
	{
		long hour=ld.getHour();
		if(hour<12)
			return "Good Morning "+user;
		else if(hour<16)
			return "Good Afternoon "+user;
		else if(hour<20)
			return "Good Evening "+user;
		else
			return "Good Night "+user;
	}
}
