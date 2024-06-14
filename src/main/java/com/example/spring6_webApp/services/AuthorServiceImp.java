package com.example.spring6_webApp.services;

import com.example.spring6_webApp.dto.AuthorDTO;
import com.example.spring6_webApp.mappers.AuthorMapper;
import com.example.spring6_webApp.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@RequiredArgsConstructor
@Service
public class AuthorServiceImp implements AuthorService {
    private final AuthorRepository authorRepository;
    private final AuthorMapper authorMapper;

    @Override
    public Iterable<AuthorDTO> findAll() {
        ArrayList<AuthorDTO> authorsDTOs = new ArrayList<>();
        authorRepository.findAll()
                .forEach(author -> authorsDTOs.add(
                        authorMapper.authorToAuthorDTO(author)
                ));
        return authorsDTOs;
    }
}