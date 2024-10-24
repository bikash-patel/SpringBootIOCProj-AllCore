package com.bikash.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MyApplicationRunners implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("MyCommandLineRunners.run()");
		System.out.println("No Oprion Argument : "+args.getNonOptionArgs());
	}

}
