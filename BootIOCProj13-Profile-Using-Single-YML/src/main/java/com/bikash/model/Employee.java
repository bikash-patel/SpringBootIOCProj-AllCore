package com.bikash.model;

import lombok.Data;

@Data
public class Employee {
	private Integer empno;
	private String empname;
	private String empdeg;
	private Double empsal;
	private Integer deptno;
}
