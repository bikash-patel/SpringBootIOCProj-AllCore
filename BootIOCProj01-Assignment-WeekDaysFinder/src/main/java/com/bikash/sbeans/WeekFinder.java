package com.bikash.sbeans;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeekFinder {
	
	@Autowired
	private LocalDate ld;
	public String getMessage(String user)
	{
		int days=ld.getDayOfWeek().getValue();
		if(days>=1 && days<=5)
			return "Happy Weekdays"+user;
		else
			return "Enjoy your weekend "+user;
	}
}
