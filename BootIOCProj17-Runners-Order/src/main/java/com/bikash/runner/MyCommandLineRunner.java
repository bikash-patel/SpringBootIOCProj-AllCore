package com.bikash.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
//@Order //Lower value higher priority //No value is always higher priority
@Order(100) //Higher value lower priority
public class MyCommandLineRunner implements CommandLineRunner,Ordered {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("MyApplicationRunner: CommandLine Runner");
		for(String args1:args)
		{
			System.out.println(args1);
	    }
		System.out.println("-----------------------------------");
	}

	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 2; //If both annotation specific and Interface specific order is define then
		//Interface specific define value will participate in order
	}


}
