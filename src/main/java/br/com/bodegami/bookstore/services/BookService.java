package br.com.bodegami.bookstore.services;

import br.com.bodegami.bookstore.domains.dto.BookRequest;
import br.com.bodegami.bookstore.domains.dto.BookResponse;

public interface BookService {

	public BookResponse saveBook(BookRequest bookRequest);
	
}
