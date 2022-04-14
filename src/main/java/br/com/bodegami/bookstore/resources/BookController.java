package br.com.bodegami.bookstore.resources;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.bodegami.bookstore.domains.dto.BookRequest;
import br.com.bodegami.bookstore.domains.dto.BookResponse;
import br.com.bodegami.bookstore.services.BookService;

@RestController
@RequestMapping(value = "/bookstore")
public class BookController {
	
	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}


	@PostMapping(value = "/add")
	public ResponseEntity<BookResponse> adicionaLivro(@RequestBody BookRequest bookRequest) {
		BookResponse bookResponse = bookService.saveBook(bookRequest);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(bookResponse.getId()).toUri();
		return ResponseEntity.created(uri).body(bookResponse);
		
	}
	
	
	
}
