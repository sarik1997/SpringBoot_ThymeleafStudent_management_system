package Student.demo.service;

import java.util.List;

import Student.demo.model.Student;

public interface StudentService {
	List<Student> getAllStudent();

	void saveStudent(Student student);

}
