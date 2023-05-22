package com.nit.reprository;

import org.springframework.data.repository.CrudRepository;

import com.nit.entity.Student;

public interface IStedentReprository extends CrudRepository<Student, Integer> {

}
