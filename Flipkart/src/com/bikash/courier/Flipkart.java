package com.bikash.courier;


import java.util.Arrays;

import com.bikash.factory.Courier;

public final class Flipkart {
	
	public String shopping(String[] item,double[] price)
	{
		double total=0.0;
		for(double p:price)
		{
			total=total+p;
		}
		
		String msg=Courier.getInstance("ecomexpress");
		return msg+ Arrays.toString(item)+" having price : "+total;
	}

}
