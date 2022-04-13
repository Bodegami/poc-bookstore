package br.com.bodegami.bookstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bodegami.bookstore.domains.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
