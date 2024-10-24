package com.bikash.ClientTest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import com.bikash.config.EmpConfig;
import com.bikash.sbeans.Properties;

public class ClientTest {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(EmpConfig.class);
		Properties prop=acac.getBean("prop",Properties.class);
		System.out.println(prop);
		Environment e=acac.getEnvironment();
		System.out.println(e.getProperty("emp.empname"));
		System.out.println(e.getClass().getName());
		acac.close(); 
	}
}
