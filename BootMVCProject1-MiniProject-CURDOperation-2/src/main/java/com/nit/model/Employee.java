package com.nit.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="emp")
@Data
public class Employee implements Serializable {

	@Id
	@SequenceGenerator(name="gen1",sequenceName="emp_id_seq")
	@GeneratedValue(generator="gen1")
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private Integer empno;
	@Column(length=20)
	private String ename;
	@Column(length=20)
	private String job;
	private Double sal;
	private Integer deptno;
	
	
	
}
