package io.glearning.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.mysql.cj.xdevapi.SessionFactory;

import io.glearning.model.Student;

@Repository
public class StudentService {
	
	private final SessionFactory sessionFactory;
	
	public StudentService(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public Student saveStudent(Student student) {
		
		
		return null;
	}
	
	public List<Student> listOfStudents(){
		
		return null;
	}
	
	public Student fetchStudentById(long id){
		
		return null;
	}
	
	public void deleteStudentById(long id) {
		
	}
}
