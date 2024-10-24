package com.bikash.sbeans;

import org.springframework.stereotype.Component;

@Component("ecomExpress")
//@Component("courier")  //its bean id match with Courier then it will inject
public class EcomExpress implements ICourier {

	@Override
	public String delivery(int oid) {
		// TODO Auto-generated method stub
		return oid+" Order ID given to EcomExpress..";
	}

}
