package com.bikash.test;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bikash.configuration.ConfigurationClass;
import com.bikash.sbeans.WishMessageGenerator;

public class ClientTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(ConfigurationClass.class);
		WishMessageGenerator wmg1=acac.getBean("wmg",WishMessageGenerator.class);
		WishMessageGenerator wmg2=acac.getBean("wmg",WishMessageGenerator.class);
		String msg=wmg1.getWishMessage("Bikash");
		System.out.println(msg);
		System.out.println(wmg1.hashCode()+"...."+wmg2.hashCode());  
		//two reference pointing to same bean id but its creation one object only because its by default 
		//singleton scope spring beans
		System.out.println("wmg1==wmg2 ? "+(wmg1==wmg2));
		System.out.println("Total number of spring beans :  "+acac.getBeanDefinitionCount());
		System.out.println("Names of spring beans :  "+Arrays.toString(acac.getBeanDefinitionNames()));
		//Above line will give both userdefine and predefine spring beans name
	}

}
