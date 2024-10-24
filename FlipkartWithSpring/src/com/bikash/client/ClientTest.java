package com.bikash.client;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bikash.common.Flipkart;
import com.bikash.configuration.FlipkartConfig;

public class ClientTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(FlipkartConfig.class);
		Flipkart flkt=acac.getBean("flkt",Flipkart.class);
		String receipt=flkt.shopping(new String[] {"Watch","Ring","Dress"},new double[] {2000.0,300.0,23000.0});
		System.out.println(receipt);
		acac.close();
	}

}
