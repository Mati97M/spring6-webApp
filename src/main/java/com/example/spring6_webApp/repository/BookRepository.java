package com.example.spring6_webApp.repository;

import com.example.spring6_webApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}