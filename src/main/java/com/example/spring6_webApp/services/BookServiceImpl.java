package com.example.spring6_webApp.services;

import com.example.spring6_webApp.domain.Book;
import com.example.spring6_webApp.dto.BookDTO;
import com.example.spring6_webApp.mappers.BookMapper;
import com.example.spring6_webApp.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public Iterable<BookDTO> findAll() {
        Iterable<Book> books = bookRepository.findAll();
        return StreamSupport.stream(books.spliterator(), false)
                .map(bookMapper::bookToBookDTO)
                .toList();
    }
}