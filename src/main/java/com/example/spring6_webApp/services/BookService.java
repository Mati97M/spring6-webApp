package com.example.spring6_webApp.services;

import com.example.spring6_webApp.dto.BookDTO;

public interface BookService {
    Iterable<BookDTO> findAll();
}