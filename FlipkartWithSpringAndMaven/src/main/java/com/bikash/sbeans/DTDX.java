package com.bikash.sbeans;

import org.springframework.stereotype.Component;

@Component("dTDX")
public class DTDX implements ICourier {

	@Override
	public String deliver(int oid) {
		return oid+" Order ID is given to DTDX...";
	}

}
