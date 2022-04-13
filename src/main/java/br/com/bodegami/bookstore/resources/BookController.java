package br.com.bodegami.bookstore.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bodegami.bookstore.domains.Book;
import br.com.bodegami.bookstore.domains.dto.BookRequest;
import br.com.bodegami.bookstore.repositories.BookRepository;

@RestController
@RequestMapping(value = "/bookstore")
public class BookController {
	
	private final BookRepository repository;
	
	public BookController(BookRepository repository) {
		this.repository = repository;
	}


	@PostMapping(value = "/add")
	public ResponseEntity<Book> adicionaLivro(@RequestBody BookRequest bookRequest) {
		Book book = bookRequest.toModel();
		repository.save(book);
		
		return ResponseEntity.ok(book);
		
	}
	
	
	
}
