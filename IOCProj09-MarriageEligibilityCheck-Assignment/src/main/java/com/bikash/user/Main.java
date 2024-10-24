package com.bikash.user;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bikash.config.ConfigMarriage;
import com.bikash.sbeans.EligibilityCheck;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(ConfigMarriage.class);
		EligibilityCheck vc=acac.getBean("eligibilityCheck",EligibilityCheck.class);
		String msg=vc.checkEligibility();
		System.out.println(msg);
		acac.close();
	}

}
