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

    @Override
    public Iterable<BookDTO> findAll() {
        ArrayList<BookDTO> bookDTOs = new ArrayList<>();
        bookRepository.findAll()
                .forEach(book -> bookDTOs.add(
                        BookMapper.INSTANCE.booktoBookDTO(book))
                );
        return bookDTOs;
    }
}