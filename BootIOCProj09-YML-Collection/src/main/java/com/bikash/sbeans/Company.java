package com.bikash.sbeans;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Setter;
import lombok.ToString;

@Component
@ConfigurationProperties(prefix ="org.company")
@Setter
@ToString
public class Company {
private String[] companyNames;

private String[] location;

private List<String> colors;

private Set<Long> phone;

private Map<String,Integer> pindcode;
}
