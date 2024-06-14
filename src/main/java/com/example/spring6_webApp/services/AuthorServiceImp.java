package com.example.spring6_webApp.services;

import com.example.spring6_webApp.domain.Author;
import com.example.spring6_webApp.dto.AuthorDTO;
import com.example.spring6_webApp.mappers.AuthorMapper;
import com.example.spring6_webApp.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.StreamSupport;

@RequiredArgsConstructor
@Service
public class AuthorServiceImp implements AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Override
    public Iterable<AuthorDTO> findAll() {
        Iterable<Author> authors = authorRepository.findAll();
        return StreamSupport.stream(authors.spliterator(), false)
                .map(authorMapper::authorToAuthorDTO)
                .toList();
    }
}