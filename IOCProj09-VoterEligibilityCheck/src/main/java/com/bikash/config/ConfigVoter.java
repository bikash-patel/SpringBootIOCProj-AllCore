package com.bikash.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.bikash")
@PropertySource("com/bikash/commons/voterDetails.properties")
public class ConfigVoter {

}
