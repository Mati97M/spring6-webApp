package com.example.spring6_webApp.services;

import com.example.spring6_webApp.domain.Author;

public interface AuthorService {
    Iterable<Author> findAll();
}
