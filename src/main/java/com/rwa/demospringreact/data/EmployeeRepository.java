/*package com.rwa.data;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.rwa.model.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Long> {

		Page<Employee> findAll(Pageable pageable);

		Page<Employee> findByNameContainingAllIgnoringCase(String name, Pageable pageable);

		Employee findByName(String name);
}
*/