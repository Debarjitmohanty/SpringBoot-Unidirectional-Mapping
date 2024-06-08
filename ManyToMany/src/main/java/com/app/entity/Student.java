package com.app.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	private Integer studentId;
	private String studentName;
	
	@ManyToMany
	@JoinTable(name="Student_Book_Tab",
	joinColumns=@JoinColumn(name="studentIdFk"),
	inverseJoinColumns = @JoinColumn(name="bookId")
	)
	private Set<Book> books;
}
