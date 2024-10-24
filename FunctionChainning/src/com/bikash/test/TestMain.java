package com.bikash.test;

import java.util.Scanner;
import java.util.function.Function;

public class TestMain {

	public static void main(String[] args) {
		/*Function<String,String> f1=s->s.toUpperCase();
		Function<String,String> f2=s->s.substring(0, 9);
		System.out.println(f1.apply("ThabiraSasmita"));
		System.out.println(f2.apply("ThabiraSasmita"));
		System.out.println(f1.andThen(f2).apply("ThabiraSasmita"));
		System.out.println(f1.compose(f2).apply("ThabiraSasmita"));*/
		
		
		/*Function<Integer,Integer> f1=i->i+i;
		Function<Integer,Integer> f2=i->i*i*i;
		System.out.println(f1.andThen(f2).apply(2));
		System.out.println(f1.compose(f2).apply(2));*/
		
		
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter user name");
		String name=sc.next();
		System.out.println("Enter password");
		String password=sc.next();
		Function<String,String> f1=s->s.toUpperCase();
		Function<String,String> f2=s->s.substring(0,5);
		if(f1.andThen(f2).apply(name).equals("bikash") && password.equals("java")) {
			System.out.println("Valid Credential");
		}
		else
			System.out.println("Invalid credential");*/
		
		Function<String,String> f1=Function.identity();
		System.out.println(f1.apply("Bikash"));
	}

}
