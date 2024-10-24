package com.bikash.factory;

import com.bikash.components.DiselEngine;
import com.bikash.components.ElectricEngine;
import com.bikash.components.IEngine;
import com.bikash.components.PetrolEngine;

public final class Vehicle {
	public static final String getInstance(String ref,String vehicleName)
	{
		IEngine engine=null;
		if(ref.equalsIgnoreCase("petrolengine"))
			engine=new PetrolEngine();
		else if(ref.equalsIgnoreCase("diselengine"))
			engine=new DiselEngine();
		else if(ref.equalsIgnoreCase("electricengine"))
			engine=new ElectricEngine();
		else
			 new IllegalArgumentException("No Such Kind Of Engine Available");
		String msg=engine.engineType(vehicleName);
		return msg;
	}
}
