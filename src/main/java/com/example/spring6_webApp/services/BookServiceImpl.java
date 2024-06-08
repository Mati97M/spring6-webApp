package com.example.spring6_webApp.services;

import com.example.spring6_webApp.domain.Book;
import com.example.spring6_webApp.repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
}