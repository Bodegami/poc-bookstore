package br.com.bodegami.bookstore.domains.dto;

import java.math.BigDecimal;

import br.com.bodegami.bookstore.domains.Book;

public class BookRequest {

	private String name;

	private String ispb;

	private String author;

	private BigDecimal price;

	// Hibernate Only
	public BookRequest() {
	}

	public BookRequest(String name, String ispb, String author, BigDecimal price) {
		this.name = name;
		this.ispb = ispb;
		this.author = author;
		this.price = price;
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
	
	public Book toModel() {
		return new Book(this.name, this.ispb, this.author, this.price);
	}
	
}
