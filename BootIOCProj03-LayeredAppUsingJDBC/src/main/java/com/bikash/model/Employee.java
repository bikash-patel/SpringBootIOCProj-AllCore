package com.bikash.model;

import lombok.Data;

@Data
public class Employee {
	private Integer empid;
	private String empname;
	private String empdeg;
	private Double empsalary;
	private Integer deptno;
	private Double grossSalary;
	private Double netSalary;
}
