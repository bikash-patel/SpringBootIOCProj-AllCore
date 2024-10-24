package com.bikash.common;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.bikash.sbeans.ICourier;

@Component("flkt")
public class Flipkart {
	
	@Qualifier("blueDart")
	@Autowired
	private ICourier courier;
	public String shopping(String[] item,double[] price)
	{
		double totalPrice=0.0;
		for(double p:price)
		{
			totalPrice=totalPrice+p;
		}
		int oid=new Random().nextInt(10000);
		String msg=courier.delivery(oid);
		return msg+Arrays.toString(item)+" having total price : "+totalPrice;
	}
}
