package com.ruiz.encapsulation;

public class Student {
	private long studentId;
	private String fname;
	private String lname;
	private String email;
	private String phoneNumber;
	
	//empty constructor needs to initialize variables
	public Student() {
		this.studentId=0;
		this.fname="";
		this.lname="";
		this.email="";
		this.phoneNumber="";
	}

	public Student(long studentId, String fname, String lname, String email, String phoneNumber) {
		this.studentId = studentId;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", fname=" + fname + ", lname=" + lname + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + "]";
	}
	
	
}
