package br.com.bodegami.bookstore.domains.dto;

import java.math.BigDecimal;

import br.com.bodegami.bookstore.domains.Book;

public class BookResponse {

	private Long id;

	private String name;

	private String ispb;

	private String author;

	private BigDecimal price;

	// Hibernate Only
	@Deprecated
	public BookResponse() {
	}

	public BookResponse(Book bookResponse) {
		this.id = bookResponse.getId();
		this.name = bookResponse.getName();
		this.ispb = bookResponse.getIspb();
		this.author = bookResponse.getAuthor();
		this.price = bookResponse.getPrice();
	}

	public String getName() {
		return name;
	}

	public String getIspb() {
		return ispb;
	}

	public String getAuthor() {
		return author;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public Long getId() {
		return id;
	}

}
