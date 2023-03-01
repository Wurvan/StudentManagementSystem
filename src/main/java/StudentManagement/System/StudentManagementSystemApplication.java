package StudentManagement.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import StudentManagement.System.identity.Student;
import StudentManagement.System.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student("Gemma", "Marin", "g@gmail.com");
		Student student2 = new Student("Georgina", "Artasona", "a@gmail.com");
		Student student3 = new Student("Natalia", "Gonzalez", "n@gmail.com");
		
		studentRepository.save(student1);
		studentRepository.save(student2);
		studentRepository.save(student3);
	}

}
