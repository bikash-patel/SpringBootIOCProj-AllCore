package com.bikash.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("eKart")
//@Primary         //if multiple matching is there for injection, IOC inject this obj to target class obj
public class EKart implements ICourier {

	@Override
	public String delivery(int oid) {
		// TODO Auto-generated method stub
		return oid+" Order ID given to EKart..";
	}

}
