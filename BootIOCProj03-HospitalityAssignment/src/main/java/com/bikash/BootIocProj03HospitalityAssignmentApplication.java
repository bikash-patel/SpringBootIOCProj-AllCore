package com.bikash;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bikash.controller.HospitalController;
import com.bikash.model.Hospital;

@SpringBootApplication
public class BootIocProj03HospitalityAssignmentApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootIocProj03HospitalityAssignmentApplication.class, args);
		HospitalController hctrl=ctx.getBean("hospitalController",HospitalController.class);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st Hospital location");
		String location1=sc.next();
		System.out.println("Enter 2nd Hospital location");
		String location2=sc.next();
		System.out.println("Enter 3rd Hospital location");
		String location3=sc.next();
		try {
			List<Hospital> list=hctrl.getDetails(location1,location2,location3);
			for(Hospital hos:list)
			{
				System.out.println(hos);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
