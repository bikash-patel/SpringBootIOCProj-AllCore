package com.bikash.factory;

import java.util.Random;

import com.bikash.courier.BlueDart;
import com.bikash.courier.DTDC;
import com.bikash.courier.EcomExpress;
import com.bikash.courier.ICourier;

public class Courier {
	private   static ICourier courier;
		public static String getInstance(String courierType)
		{
			if(courierType.equalsIgnoreCase("bluedart"))
				courier=new BlueDart();
			else if(courierType.equalsIgnoreCase("ecomexpress"))
				courier=new EcomExpress();
			else if(courierType.equalsIgnoreCase("dtdc"))
				courier=new DTDC();
			else
				new IllegalArgumentException("No Such kind of Courier facility available");
			
			int oid=new Random().nextInt(10000);
			String msg=courier.deliver(oid);
			return msg;
		}
	}
