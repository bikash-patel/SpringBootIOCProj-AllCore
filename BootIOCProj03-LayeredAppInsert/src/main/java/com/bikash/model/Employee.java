package com.bikash.model;

import lombok.Data;

@Data
public class Employee {
	private Integer empNo;
	private String empName;
	private String empDesg;
	private Double salary;
	private Integer deptNo;
}
