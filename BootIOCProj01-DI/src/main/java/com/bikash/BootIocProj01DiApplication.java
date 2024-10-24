package com.bikash;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.bikash.sbeans.SeasonFinder;

@SpringBootApplication
public class BootIocProj01DiApplication {

	@Bean("ld")
  LocalDate getSeason()
	{
		return LocalDate.now();
	}
	public static void main(String[] args) {
		ApplicationContext ctx= SpringApplication.run(BootIocProj01DiApplication.class, args);
		SeasonFinder sf=ctx.getBean("seasonFinder",SeasonFinder.class);
		String msg=sf.getCurrentSeason();
		System.out.println(msg);
		((ConfigurableApplicationContext) ctx).close();
	}

}
