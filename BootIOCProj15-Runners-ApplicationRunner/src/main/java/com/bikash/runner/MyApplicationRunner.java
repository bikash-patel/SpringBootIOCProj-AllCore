package com.bikash.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunner implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MyApplicationRunner.run()");
		System.out.println("No Optional Argument : "+args.getNonOptionArgs());
		for(String name:args.getOptionNames())
			System.out.println(name+"-->"+args.getOptionValues(name));
	}

}
