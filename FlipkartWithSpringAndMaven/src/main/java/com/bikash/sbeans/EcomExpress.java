package com.bikash.sbeans;

import org.springframework.stereotype.Component;

@Component("ecomExpress")
public class EcomExpress implements ICourier {

	@Override
	public String deliver(int oid) {
		return oid+" Order ID is given to EcomExpress...";
	}

}
