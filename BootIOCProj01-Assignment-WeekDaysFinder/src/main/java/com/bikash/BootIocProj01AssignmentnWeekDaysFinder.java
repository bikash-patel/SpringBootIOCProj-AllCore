package com.bikash;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.bikash.sbeans.WeekFinder;

@SpringBootApplication
public class BootIocProj01AssignmentnWeekDaysFinder {
	
	public static void main(String[] args) {
		ApplicationContext acac=SpringApplication.run(BootIocProj01AssignmentnWeekDaysFinder.class, args);
		//Storing implementation class obj with Interface ref variable
		WeekFinder wmg=acac.getBean("weekFinder",WeekFinder.class);
		String msg=wmg.getMessage("Bikash");
		System.out.println(msg);
		((ConfigurableApplicationContext) acac).close(); 
		//On Interface ref variable we can not directly called close() method if that method is not 
		//common in interface and its implementation  class that why we are type casting here
		
	}
	@Bean
	 LocalDate getHour()
	{
		return LocalDate.now();
	}

}
