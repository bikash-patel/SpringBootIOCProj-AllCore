package com.bikash.sbeans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component("hotelMenu")
@Data
public class HotelMenu {
	@Value("${price.idlirate}")
	private Double idli;
	@Value("${price.dosarate}")
	private Double dosa;
	@Value("${price.samosarate}")
	private Double samosa;
	@Value("${price.badarate}")
	private Double bada;
	@Value("${price.purirate}")
	private Double puri;
}
