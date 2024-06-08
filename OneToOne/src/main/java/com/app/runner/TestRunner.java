package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Book;
import com.app.entity.Student;
import com.app.repo.BookRepo;
import com.app.repo.StudentRepo;

@Component
public class TestRunner implements CommandLineRunner{

	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private BookRepo bookRepo;
	
	@Override
	public void run(String... args) throws Exception {
	
		Book b1=new Book(101,"Spring");
		Book b2=new Book(102,"Java");
		
		bookRepo.save(b1);
		bookRepo.save(b2);
		
		Student s1=new Student(01,"Deb",b1);
		Student s2=new Student(02,"Sam",b2);	
		
		studentRepo.save(s1);
		studentRepo.save(s2);
		
		
		
		
		
		
	}

}
