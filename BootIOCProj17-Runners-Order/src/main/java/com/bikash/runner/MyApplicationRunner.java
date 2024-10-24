package com.bikash.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(10)
public class MyApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("MyApplicationRunner: Application Runner");
		System.out.println(args.getNonOptionArgs());
		for(String name:args.getOptionNames())
			System.out.println(args.getOptionValues(name));
		System.out.println("-----------------------------------");
	}

}
