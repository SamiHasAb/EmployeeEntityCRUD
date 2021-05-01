package org.study.emppro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.study.emppro.models.Employee;



public interface EmployeeRepository extends JpaRepository<Employee, Integer> {


	// add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
	
}
