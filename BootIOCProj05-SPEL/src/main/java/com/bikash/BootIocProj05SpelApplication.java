package com.bikash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

import com.bikash.sbeans.HotelDetails;

@SpringBootApplication
//@PropertySource("customer_details.properties")   This is the 2nd way..One more way is ther in application.properties file
public class BootIocProj05SpelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj05SpelApplication.class, args);
		HotelDetails hd=ctx.getBean("hDetails",HotelDetails.class);
		System.out.println(hd);
		((ConfigurableApplicationContext) ctx).close();
	}

}
