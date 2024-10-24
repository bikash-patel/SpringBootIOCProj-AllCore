package com.bikash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.bikash.sbeans.Journey;

@SpringBootApplication
@ImportResource("com/bikash/cfg/applicationContext.xml")
public class BootIocProj02EngineLoosCouplingApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj02EngineLoosCouplingApplication.class, args);
		Journey journey=ctx.getBean("journey",Journey.class);
		journey.journey("Coimbatore","Bargarh");
		((ConfigurableApplicationContext) ctx).close();
	}

}
