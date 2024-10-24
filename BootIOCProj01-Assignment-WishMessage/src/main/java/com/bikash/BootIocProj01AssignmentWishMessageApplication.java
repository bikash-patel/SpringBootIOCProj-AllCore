package com.bikash;

import java.time.LocalTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.bikash.sbeans.WishMessage;

@SpringBootApplication
public class BootIocProj01AssignmentWishMessageApplication {

	public static void main(String[] args) {
		ApplicationContext acac=SpringApplication.run(BootIocProj01AssignmentWishMessageApplication.class, args);
		//Storing implementation class obj with Interface ref variable
		WishMessage wmg=acac.getBean("wishMessage",WishMessage.class);
		String msg=wmg.getMessage("Bikash");
		System.out.println(msg);
		((ConfigurableApplicationContext) acac).close(); 
		//On Interface ref variable we can not directly called close() method if that method is not 
		//common in interface and its implementation  class that why we are type casting here
		
	}
	@Bean
	 LocalTime getHour()
	{
		return LocalTime.now();
	}

}
