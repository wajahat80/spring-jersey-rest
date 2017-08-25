package com.rwa.springjerseyrest.model;

public class Employee {

	long empId;
	String empName;
	
	public Employee(long empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	
	public long getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}
