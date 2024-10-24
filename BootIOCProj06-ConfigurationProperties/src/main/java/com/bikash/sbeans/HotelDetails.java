package com.bikash.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component("hDetails")
@ConfigurationProperties(prefix = "org.hotel")
@Data
public class HotelDetails {
	@Value("40155")
	private Integer hID;  //Hard Coded
	
	private String name;
	private String address;
	private Long mblno;
//private String customerName; If we give name which mismatch property name with properties 
             	//file then it wont throw any error it will take null as default value
	
	private String customer_name;
	
	/*@Value("#{hotelMenu.idli+hotelMenu.dosa+hotelMenu.bada}")
	private Double totalBill;*/    //It doesn't support SPEL
	
	@Value("${hotel.capacity}")
	private Integer hotelCapacity;
}
