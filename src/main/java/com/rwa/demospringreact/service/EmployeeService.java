package com.rwa.demospringreact.service;

import java.util.List;

import com.rwa.demospringreact.model.Employee;

/*
 * A very good example for using service and pagination
 * https://github.com/spring-projects/spring-boot
 */
public interface EmployeeService {
	
	Employee getEmployee(long empId);

	//Page<Employee> findEmployees(Pageable pageable);
	
	List<Employee> findEmployees();
	
	void addEmployee(Employee emp);

	
}
