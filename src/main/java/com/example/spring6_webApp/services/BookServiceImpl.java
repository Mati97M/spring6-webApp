package com.example.spring6_webApp.services;

import com.example.spring6_webApp.dto.BookDTO;
import com.example.spring6_webApp.mappers.BookMapper;
import com.example.spring6_webApp.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Override
    public Iterable<BookDTO> findAll() {
        ArrayList<BookDTO> bookDTOs = new ArrayList<>();
        bookRepository.findAll()
                .forEach(book -> bookDTOs.add(
                        bookMapper.booktoBookDTO(book))
                );
        return bookDTOs;
    }
}