package com.bikash.test;

import java.util.Random;
import java.util.function.Supplier;

public class TestMain {
	public static void main(String[] args) {
		/*Supplier<String> s=()->{String[] str={"Bikash","Sasmita","Sandhya","Karan"};
		                               int r=new Random().nextInt(3)
		                                return str[r];
		                                 	};
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());*/
		
		//Random 6 digit OTP generation
		/*Supplier<Integer> s= ()->{ int a=(new Random().nextInt(900000)+100000);
		                            return a;
		                            		};
		System.out.println("SIX Digit OTP is : "+s.get());
		System.out.println("SIX Digit OTP is : "+s.get());
		System.out.println("SIX Digit OTP is : "+s.get());
		}*/
		

		
		//Random password of 8 digit
		//Should allow digit in 2,4,6,8 place and allow 
		//Upper case character including special symbol (@,#,$) at 1,3,5,7 place only
		Supplier<Integer> digit=()->{return new Random().nextInt(9);};
		Supplier<Character> character=()->{
	                                String val="ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
	                                return val.charAt(new Random().nextInt(29));
	                                }; 
       Supplier<String> pwd=()->{
    	   String password="";
           for(int i=1;i<=8;i++)
           {
                password=i%2==0?(password+digit.get()):(password+character.get());
           }
           return  password;
       };
		System.out.println(pwd.get());
		System.out.println(pwd.get());
		System.out.println(pwd.get());
		System.out.println(pwd.get());
		}
	}
