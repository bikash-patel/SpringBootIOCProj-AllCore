package com.bikash.sbeans;

import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements IEngine {

	@Override
	public void engineStart() {
		// TODO Auto-generated method stub
		System.out.println("Electric engine started");
	}

}
