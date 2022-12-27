package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.entity.Student;
import com.example.repository.StudentRepository;

@SpringBootApplication
public class Spring3demoApplication implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepository;

	public static void main(String[] args) {
		SpringApplication.run(Spring3demoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Student student = Student.builder().name("Ankit").email("ankit@Gmail.com").build();
		Student student2 = Student.builder().name(" Anchal").email("a@Gmail.com").build();
		Student student3 = Student.builder().name("Rajan ").email("r@Gmail.com").build();
		Student student4 = Student.builder().name("Tanuja").email("t@Gmail.com").build();

		studentRepository.save(student);
		studentRepository.save(student2);
		studentRepository.save(student3);
		studentRepository.save(student4);
		System.out.println("-----------------students saved---------------------");

	}

}
