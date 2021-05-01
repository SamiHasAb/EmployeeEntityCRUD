package org.study.emppro.services;

import java.util.List;

import org.study.emppro.models.Employee;


public interface EmployeeService {
	
	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	

}
