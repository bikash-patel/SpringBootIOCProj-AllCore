package com.bikash.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class EligibilityCheck {
	@Value("${candidate.name}")
	private String name;
	@Value("${candidate.age}")
	private double age;
	@Value("${candidate.gender}")
	private String gender;
	private Date doi;
	
	public EligibilityCheck()
	{
		System.out.println("EligibilityCheck : 0-arg constructor");
	}
	@PostConstruct
	public void init()
	{
		System.out.println("MarriageCheck.init() method");
			doi=new Date();
			if(name.equals("") || name==null || age<1 || age>120)
				throw new IllegalArgumentException("Invalid input");
	}
	public String checkEligibility()
	{
		 if(age>=18 && gender.equalsIgnoreCase("female")) 
			 return "Mr/Mrs. "+name+" you are eligible for Marriage..verified on "+doi;
		 else if(age>=22 && gender.equalsIgnoreCase("male"))
			 return "Mr/Mrs. "+name+" you are eligible for Marriage..verified on "+doi;
		 else
			 return "Mr/Mrs. "+name+" you are not eligible for Marriage..verified on "+doi;
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("MarriageCheck.destroy() method");
		name=null;
		age=0;
		gender=null;
	}
}
