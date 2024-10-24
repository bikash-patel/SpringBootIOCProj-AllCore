package com.bikash.sbeans;

import org.springframework.stereotype.Component;

@Component
public class DieselEngine implements IEngine {

	@Override
	public void engineStart() {
		// TODO Auto-generated method stub
		System.out.println("Diesel engine started");
	}

}
