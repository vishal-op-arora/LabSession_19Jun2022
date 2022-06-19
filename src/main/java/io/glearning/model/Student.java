package io.glearning.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "students")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "student_id")
	private long studentID;
	
	@Column(name = "student_name", nullable = false)
	private String studentName;
	
	@Column(name = "student_department", nullable = false)
	private String studentDepartment;
	
	@Column(name = "student_country", nullable = false)
	private String studentCountry;
	
	public Student() {
		
	}

	public Student(String studentName, String studentDeparment, String studentCountry) {
		super();
		this.studentName = studentName;
		this.studentDepartment = studentDeparment;
		this.studentCountry = studentCountry;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentDeparment() {
		return studentDepartment;
	}

	public void setStudentDeparment(String studentDeparment) {
		this.studentDepartment = studentDeparment;
	}

	public String getStudentCountry() {
		return studentCountry;
	}

	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}

	public long getStudentID() {
		return studentID;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", studentName=" + studentName + ", studentDeparment="
				+ studentDepartment + ", studentCountry=" + studentCountry + "]";
	}
	
	
}