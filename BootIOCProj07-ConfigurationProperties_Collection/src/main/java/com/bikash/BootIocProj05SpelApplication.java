package com.bikash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.bikash.sbeans.Company;

@SpringBootApplication
//@PropertySource("customer_details.properties")   This is the 2nd way..One more way is their in application.properties file
public class BootIocProj05SpelApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj05SpelApplication.class, args);
		Company hd=ctx.getBean("company",Company.class);
		System.out.println(hd);
		((ConfigurableApplicationContext) ctx).close();
	}

}
