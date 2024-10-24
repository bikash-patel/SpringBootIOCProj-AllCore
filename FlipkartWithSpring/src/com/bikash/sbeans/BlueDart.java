package com.bikash.sbeans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("blueDart")
public class BlueDart implements ICourier {

	@Override
	public String delivery(int oid) {
		// TODO Auto-generated method stub
		return oid+" Order ID given to BlueDart..";
	}

}
