package com.nit.service;

import com.nit.entity.Student;

public interface IStudentService {

	public String register(Student student);
	
	public Iterable<Student>getAllStudent();
}
