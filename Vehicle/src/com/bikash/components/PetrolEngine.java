package com.bikash.components;

public final class PetrolEngine implements IEngine {

	@Override
	public String engineType(String vehicleName) {
		return "Your "+vehicleName+" has been changed to Petrol Type Engine";
	}

}
