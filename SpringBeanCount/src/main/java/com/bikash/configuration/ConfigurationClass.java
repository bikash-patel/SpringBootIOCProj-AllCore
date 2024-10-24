package com.bikash.configuration;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
@ComponentScan("com.bikash")
public class ConfigurationClass
{
	@Bean("lt")
	@Lazy
  public LocalTime getTime()
  {
		System.out.println("ConfigurationClass.getTime()  bean creation");
	  return LocalTime.now();
  }
	@Bean("ld")
	@Lazy
	  public LocalDate getHour()
	  {
		System.out.println("ConfigurationClass.getHour()  bean creation");
		  return LocalDate.now();
	  }
	// In this program i am not using this LocalDate bean object still IOC Container creating object for this
	//we can stop this by using @Lazy annotaion,if we place @Lazy instantiation on spring bean then for this
	//spring beans object will be created when we use it in getBean()
}
