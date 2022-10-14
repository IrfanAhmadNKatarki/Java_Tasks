package com.valtech.spring.boot.service;

import java.util.List;

import com.example.demo.boot.entity.Author;



public interface AuthorService {
	Author createBook(Author author);

	Author updateAuthor(Author author);

	List<Author> getAll();

	Author getBook(int id);

	Author getAllBooks();

	Author getAllBook(int id);

}