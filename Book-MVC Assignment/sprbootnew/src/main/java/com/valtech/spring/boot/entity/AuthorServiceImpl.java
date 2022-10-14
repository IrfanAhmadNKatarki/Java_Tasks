package com.valtech.spring.boot.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.boot.entity.Author;
import com.example.demo.boot.repo.AuthorRepository;
@Service
@Transactional(propagation=Propagation.REQUIRED)
public class AuthorServiceImpl implements AuthorService {

	private AuthorRepository authorRepo;
	
	@Override
	@Transactional(propagation=Propagation.REQUIRED)

	public Author createBook(Author author) {
		// TODO Auto-generated method stub
		return authorRepo.save(author);
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)

	public Author updateAuthor(Author author) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)

	public List<Author> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)

	public Author getBook(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)

	public Author getAllBooks() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional(propagation=Propagation.REQUIRED)

	public Author getAllBook(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
