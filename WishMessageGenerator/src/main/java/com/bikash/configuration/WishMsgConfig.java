package com.bikash.configuration;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration 
//If bean id not provided for COnfiguration
//it will take class name(1st letter in lower case name)as bean id by default
@ComponentScan("com.bikash")
public class WishMsgConfig 
{
   @Bean
   //If bean id not provided it will take method name as bean id by default
   public LocalTime getTime()
   {
	   System.out.println("WishMsgConfig.getTime()");
	   return LocalTime.now();
   }
   @Bean
   //@Lazy  // won't effect on prototype scope ,its for only singleton
   public LocalDate getDate()
   {
	   System.out.println("WishMsgConfig.getDate()");
	   return LocalDate.now();
   }
}
