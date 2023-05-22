package com.nit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Student;
import com.nit.reprository.IStedentReprository;

@Service("stdService")
public class StudentService implements IStudentService {

	@Autowired
	private IStedentReprository istdR;
	
	@Override
	public String register(Student student) {
		
		return "student is saved with id value"+istdR.save(student).getId();
	}

	@Override
	public Iterable<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return istdR.findAll();
	}

}
