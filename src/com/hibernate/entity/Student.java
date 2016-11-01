package com.hibernate.entity;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long idSudent;
	private String nameSudent;
	private String emailStudent;
	
	public Long getIdSudent() {
		return idSudent;
	}
	public void setIdSudent(Long idSudent) {
		this.idSudent = idSudent;
	}
	public String getNameSudent() {
		return nameSudent;
	}
	public void setNameSudent(String nameSudent) {
		this.nameSudent = nameSudent;
	}
	public String getEmailStudent() {
		return emailStudent;
	}
	public void setEmailStudent(String emailStudent) {
		this.emailStudent = emailStudent;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
