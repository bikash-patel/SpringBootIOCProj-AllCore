package com.bikash.courier;

public class BlueDart implements ICourier {

	@Override
	public String deliver(int oid) {
		return "Order ID "+oid+" is given to BlueDart ..";
	}

}
