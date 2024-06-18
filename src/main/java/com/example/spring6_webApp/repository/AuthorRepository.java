package com.example.spring6_webApp.repository;

import com.example.spring6_webApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
