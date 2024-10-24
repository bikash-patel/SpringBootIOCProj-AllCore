package com.bikash.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class Config {
	
	@Bean("messageSource")
	public ResourceBundleMessageSource getProperties()
	{
	ResourceBundleMessageSource rbms=new ResourceBundleMessageSource();
	rbms.setBasename("com/bikash/commons/Language");
	return rbms;
	}
}
