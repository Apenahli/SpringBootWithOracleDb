package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Employee implements Serializable {

	private static final long serialVersionUID = 1L;

	// "employee_sequence" is Oracle sequence name.

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Employee_SEQ")
	@SequenceGenerator(name = "Employee_SEQ", sequenceName = "employee_sequence", allocationSize = 1)
	@Column(name = "id", unique = true, nullable = false, precision = 10)
	private Long id;

	private String name;

	private String surname;

	public Employee() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", surname=" + surname + "]";
	}

}
