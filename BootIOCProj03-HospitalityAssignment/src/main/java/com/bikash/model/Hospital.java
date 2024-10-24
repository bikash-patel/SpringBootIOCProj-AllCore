package com.bikash.model;

import lombok.Data;

@Data
public class Hospital {
	private Integer hospitalId;
	private String hospitalName;
	private String hospitalLocation;
	private Integer hospitalBedCapacity;
	private String hospitalEmail;
	private String hospitalWebsite;
}
