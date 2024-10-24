package com.bikash.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.bikash")
@ImportResource("com/bikash/xmlconfig/applicationContext.xml")
public class FlipkartConfig {
    
    }
