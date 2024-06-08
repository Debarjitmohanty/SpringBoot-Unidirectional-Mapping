package com.app.runner;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.entity.Book;
import com.app.entity.Student;
import com.app.rest.BookRepository;
import com.app.rest.StudentRepository;

@Component
public class RunnerTest implements CommandLineRunner {

	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private BookRepository bookRepo;
	@Override
	public void run(String... args) throws Exception {
		
		Book b1=new Book(101,"java");
		Book b2=new Book(102,"Spring");
		Book b3=new Book(102,"hibernate");
		
		bookRepo.save(b1);
		bookRepo.save(b2);
		bookRepo.save(b3);
		
		Set<Book> s1=Set.of(b1,b2);
		Set<Book> s2=Set.of(b2,b3);
		
		Student st1=new Student(101,"sam",s1);
		Student st2=new Student(101,"bikram",s2);
		
		studentRepo.save(st1);
		studentRepo.save(st2);
		
		
		
	}

}
