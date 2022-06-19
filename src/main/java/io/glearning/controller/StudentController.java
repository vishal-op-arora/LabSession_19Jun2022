package io.glearning.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import io.glearning.model.Student;
import io.glearning.service.StudentService;

@Controller
@RequestMapping("/students/")
public class StudentController {

	
	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}
	
	@RequestMapping("/save-student")
	public String saveStudent(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "save-student";
	}

	@RequestMapping("/list-students")
	public String listOfStudents(Model theModel) {

		List<Student> students = studentService.listOfStudents();

		// add to the spring model
		theModel.addAttribute("students", students);

		return "list-Students";
	}
	
	@RequestMapping("/delete-student")
	public String deleteStudent(@RequestParam("studentid") int studentid) {

		studentService.deleteStudentById(studentid);

		return "return:/list-students";
	}
	

}
