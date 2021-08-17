package com.revature.lombok;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Component
public class Book {
   String title;
   String isbn;
  String[] authors;
  LocalDateTime publicationDate;
  Book(){
	  title="java";
	  isbn="2332";
  }
public Book(String title, String isbn, String[] authors, LocalDateTime publicationDate) {
	super();
	this.title = title;
	this.isbn = isbn;
	this.authors = authors;
	this.publicationDate = publicationDate;
}
  
}