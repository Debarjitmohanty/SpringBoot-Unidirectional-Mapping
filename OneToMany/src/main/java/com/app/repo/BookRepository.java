package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.entity.Book;


public interface BookRepository extends JpaRepository<Book, Integer>{

}
