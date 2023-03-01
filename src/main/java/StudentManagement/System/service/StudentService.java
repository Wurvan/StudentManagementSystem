package StudentManagement.System.service;

import java.util.List;

import StudentManagement.System.identity.Student;

public interface StudentService {
	List<Student> getAllStudents();
	Student saveStudent(Student student);
	
}
