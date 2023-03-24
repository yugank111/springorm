package com.spring.orm.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "student_details21")
public class Student {

	@Id
	@Column( name ="student_id")
	private int studentId;
	
	@Column(name = "student_name")
	private String student_name;
	
	@Column(name = "city")
	private String city;

	public Student(int studentId, String student_name, String city) {
		super();
		this.studentId = studentId;
		this.student_name = student_name;
		this.city = city;
	}

	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
}
