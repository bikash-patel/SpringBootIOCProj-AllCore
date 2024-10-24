package com.bikash.client;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bikash.configuration.Config;

public class LanguageChoose {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext acac=new AnnotationConfigApplicationContext(Config.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Choose your language ");
		String lang=sc.next();
		System.out.println("Choose your Country ");
		String country=sc.next();
		Locale locale=new Locale(lang,country);
		String welcomeMsg=acac.getMessage("welcome.msg",new Object[] {"Bikash"},locale);
		String welcomeWishesh=acac.getMessage("welcome.wishesh",new Object[] {},locale);
		String welcomeBye=acac.getMessage("welcome.bye",new Object[] {},locale);
		System.out.println(welcomeMsg+"--"+welcomeWishesh+"--"+welcomeBye);
		sc.close();
		acac.close();
	}

}
