package com.example.spring6_webApp.services;

import com.example.spring6_webApp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}