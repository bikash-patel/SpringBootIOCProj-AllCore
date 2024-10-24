package com.bikash.sbeans;

import org.springframework.stereotype.Component;

@Component("blueDart")
public class BlueDart implements ICourier {

	@Override
	public String deliver(int oid) {
		return oid+" Order ID is given to BlueDartBlueDart...";
	}

}
