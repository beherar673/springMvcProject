package com.nit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="STUDENT")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
@Column(length=40)
	private String name;
@Column(length=40)
	private String colageName;
	private Double balance;
@Column(length=40)
	private String RegdNo;
	
	
}
