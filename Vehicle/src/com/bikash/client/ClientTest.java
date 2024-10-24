package com.bikash.client;

import java.util.Scanner;

import com.bikash.factory.Vehicle;

public class ClientTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Hey..Whats your vehicle name ?");
		String vehicleName=sc.next();
		System.out.println("Which type of engine do you want to install in your "+vehicleName);
		String engineType=sc.next();
		String msg=Vehicle.getInstance(engineType,vehicleName);
		System.out.println(msg);
		sc.close();
	}

}
