package com.bikash.sbeans;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;

@Component("hotelMenu")
@Setter
@ConfigurationProperties(prefix = "org.hotel")
public class HotelMenu {
	
	private Double idli;
	private Double dosa;
	private Double samosa;
	private Double bada;
	private Double puri;
}
