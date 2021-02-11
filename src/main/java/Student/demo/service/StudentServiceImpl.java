package Student.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Student.demo.model.Student;
import Student.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public List<Student> getAllStudent() {
		return studentRepository.findAll();
	}

	@Override
	public void saveStudent(Student student) {
		this.studentRepository.save(student);
	}

}
