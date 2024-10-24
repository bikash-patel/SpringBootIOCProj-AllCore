package com.bikash.user;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bikash.config.ConfigVoter;
import com.bikash.sbeans.VoterCheck;

public class Main {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(ConfigVoter.class);
		VoterCheck vc=acac.getBean("voterCheck",VoterCheck.class);
		String msg=vc.checkEligibility();
		System.out.println(msg);
		acac.close();
	}

}
