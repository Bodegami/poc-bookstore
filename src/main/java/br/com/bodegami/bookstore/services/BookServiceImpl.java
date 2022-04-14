package br.com.bodegami.bookstore.services;

import org.springframework.stereotype.Service;

import br.com.bodegami.bookstore.domains.Book;
import br.com.bodegami.bookstore.domains.dto.BookRequest;
import br.com.bodegami.bookstore.domains.dto.BookResponse;
import br.com.bodegami.bookstore.repositories.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	private final BookRepository repository;

	public BookServiceImpl(BookRepository repository) {
		this.repository = repository;
	}

	@Override
	public BookResponse saveBook(BookRequest bookRequest) {
		Book book = bookRequest.toModel();
		repository.save(book);
		return new BookResponse(book);
	}

}
