package com.bikash.clienttest;

import com.bikash.courier.Flipkart;

public class ClientTest {

	public static void main(String[] args) {
		Flipkart fpkt=new Flipkart();
		String msg=fpkt.shopping(new String[]{"Dhoti","Genji","Chaddi"},new double[] {200,400,500});
		System.out.println(msg);
	}

}
