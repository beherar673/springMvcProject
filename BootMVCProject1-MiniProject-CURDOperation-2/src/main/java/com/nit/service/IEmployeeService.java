package com.nit.service;

import com.nit.model.Employee;

public interface IEmployeeService {

	public Iterable<Employee>getAllEmployees();
	
	public String registerEmployee(Employee emp);
	
	public Employee getEmployeeByno(int empno);
	
	public String updateEmployee(Employee emp);
	
	public String deleteEmployeeById(int empno);
	
	
	
}
