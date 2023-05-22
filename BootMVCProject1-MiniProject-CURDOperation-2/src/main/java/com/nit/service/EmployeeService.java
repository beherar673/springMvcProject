package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.model.Employee;
import com.nit.repository.IEmployeeRepository;

@Service("empService")
public class EmployeeService implements IEmployeeService {

	@Autowired
	private IEmployeeRepository empRepo;
	
	@Override
	public Iterable<Employee>getAllEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}

	
	@Override
	public String registerEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return "employee is saved with id value:"+ empRepo.save(emp).getEmpno();
	}


	@Override
	public Employee getEmployeeByno(int empno) {
		// TODO Auto-generated method stub
		Employee emp=empRepo.findById(empno).orElseThrow(()->new IllegalArgumentException());
		return emp;
	}


	@Override
	public String updateEmployee(Employee emp) {
		
		return "Employee is update with having id value"+empRepo.save(emp).getEname();
	}


	@Override
	public String deleteEmployeeById(int empno) {
		empRepo.deleteById(empno);
		// TODO Auto-generated method stub
		return empno+"Employee is deleted";
	}

	

}
