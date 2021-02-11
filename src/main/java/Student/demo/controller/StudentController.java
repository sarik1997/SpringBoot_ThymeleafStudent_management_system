package Student.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import Student.demo.model.Student;
import Student.demo.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;

	// display list of student
	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("listStudent", studentService.getAllStudent());
		return "index";
	}

	@GetMapping("/showNewStudentForm")
	public String showNewStudentForm(Model model) {
		// TO SHOW NEW STUDENT FORM SO CREATING MODEL ATTRIBUTE TO BIND FORM DATA
		Student student = new Student();
		model.addAttribute("student", student);
		return "new_student";

	}

	@PostMapping("saveStudent")
	public String saveStudent(@ModelAttribute("student") Student student) {
		// save student to database
		studentService.saveStudent(student);
		return "redirect:/";
	}
}
