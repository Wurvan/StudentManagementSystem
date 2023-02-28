package StudentManagement.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import StudentManagement.System.identity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

	
}
