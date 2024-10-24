package com.bikash.sbeans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class VoterCheck {
	@Value("${voter.id}")
	private long id;
	@Value("${voter.name}")
	private String name;
	@Value("${voter.age}")
	private double age;
	private Date doi;
	
	public VoterCheck()
	{
		System.out.println("VoterCheck : 0-arg constructor");
	}
	@PostConstruct
	public void init()
	{
		System.out.println("VoterCheck.init() method");
			doi=new Date();
			if(id==0 || name.equals("") || name==null || age<1 || age>120)
				throw new IllegalArgumentException("Invali input");
	}
	public String checkEligibility()
	{
		 if(age>=18) {
			 return "Mr/Mrs. "+name+" you are eligible for vote..verified on "+doi;
		 }
		 else
		 {
			 return "Mr/Mrs. "+name+" you are not eligible for vote..verified on "+doi;
		 }
	}
	@PreDestroy
	public void destroy()
	{
		System.out.println("VoterCheck.destroy() method");
		id=0;
		name=null;
		age=0;
	}
}
