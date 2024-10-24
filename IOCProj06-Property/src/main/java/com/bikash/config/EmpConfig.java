package com.bikash.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@ComponentScan("com.bikash")
// @PropertySource("com/bikash/commons/empdetails.properties") //If we configure only one property file
@PropertySource({"com/bikash/commons/empdetails.properties","com/bikash/commons/empdetails2.properties"})
//We we configure multiple property then we have to configure like above 
//If two property having same key then the value will come from property file which we configure at last
public class EmpConfig {
	
}
