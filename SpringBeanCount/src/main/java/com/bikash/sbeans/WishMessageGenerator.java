package com.bikash.sbeans;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("wmg")
public class WishMessageGenerator 
{
	@Autowired
	private LocalTime lt;
	public WishMessageGenerator()
	{
		System.out.println("WishMessageGenerator.WishMessageGenerator() : 0-arg const");
	}
  public String getWishMessage(String userName)
  {
	  long hour=lt.getHour();
	  //................Wish message logic
	  return "Hi "+ userName+"hope you are doing well";
  }
}
