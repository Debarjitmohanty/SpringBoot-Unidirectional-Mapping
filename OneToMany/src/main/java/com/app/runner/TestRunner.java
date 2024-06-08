package com.app.runner;

import java.rmi.StubNotFoundException;
import java.util.Set;

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
	private BookRepository bookRepo;
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Override
	public void run(String... args) throws Exception {

Book b1=new Book(50,"Ds");
Book b2=new Book(60,"Spring");

bookRepo.save(b1);
bookRepo.save(b2);

Set<Book> bk1=Set.of(b1,b2);

Student s1=new Student(01,"deb",bk1);

studentRepo.save(s1);
		
	}

}
