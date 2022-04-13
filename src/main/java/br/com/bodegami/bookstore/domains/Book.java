package br.com.bodegami.bookstore.domains;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_books")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", length = 50, nullable = false)
	private String name;

	@Column(unique = true, nullable = false)
	private String ispb;

	@Column(name = "autor", length = 50, nullable = false)
	private String author;

	@Column(name = "preco", nullable = false)
	private BigDecimal price;

	// Hibernate Only
	public Book() {
	}

	public Book(String name, String ispb, String author, BigDecimal price) {
		super();
		this.name = name;
		this.ispb = ispb;
		this.author = author;
		this.price = price;
	}

	public Long getId() {
		return id;
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

}
