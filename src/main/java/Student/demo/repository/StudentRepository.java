package Student.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Student.demo.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
