package com.rwa.demospringreact.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import com.rwa.demospringreact.model.Employee;

//@Component("employeeService")
//@Transactional
//@Configurable
@Service
public class EmployeeServiceImpl implements EmployeeService {

	/*@Inject
	private EmployeeRepository employeeRepository;*/
	
	@Override
	public Employee getEmployee(long empId) {
		Assert.notNull(empId, "empId must not be null");
		
		//return this.employeeRepository.findOne(empId);
		if(empId==1)
			return new Employee(1, "Raja");
		else
			return new Employee(1, "Gary");
	}
	
	@Override
	public List<Employee> findEmployees() {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Raja"));
		empList.add(new Employee(1, "Gary"));
		
		return empList;
	}

	/*@Override
	public Page<Employee> findEmployees(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}*/

	@Override
	public void addEmployee(Employee emp) {
		// TODO Auto-generated method stub

	}


}
