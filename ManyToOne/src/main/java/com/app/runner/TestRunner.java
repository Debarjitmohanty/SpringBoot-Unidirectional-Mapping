package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Book;
import com.app.entity.Student;
import com.app.repo.BookRepository;
import com.app.repo.StudentRepository;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private BookRepository bookRepo;
	
	@Override
	public void run(String... args) throws Exception {
	
		//Book Data
		Book b1=new Book(101,"java");
		Book b2=new Book(102,"springboot");
		
		bookRepo.save(b1);
		bookRepo.save(b2);	
		
		//Student Data
		Student s1=new Student(01,"Debarjit",b1);
		Student s2=new Student(02,"Abhi",b1);
		Student s3=new Student(03,"silu",b2);
		Student s4=new Student(04,"kamal",b1);
		
		studentRepo.save(s1);
		studentRepo.save(s2);
		studentRepo.save(s3);
		studentRepo.save(s4);
		
	}

}
