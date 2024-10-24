package com.bikash.sbeans;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("seasonFinder")
public class SeasonFinder {
	
	@Autowired
	private LocalDate ld;
	public String getCurrentSeason()
	{
		int month=ld.getMonthValue();
		if(month>=3 && month<7)
			return "Summer Season";
		else if(month>=7 && month<=10)
			return "Rainy Season";
		else
			return "Winter Season";
	}
	
}
