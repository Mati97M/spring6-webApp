package com.example.spring6_webApp.services;

import com.example.spring6_webApp.dto.AuthorDTO;
import com.example.spring6_webApp.mappers.AuthorMapper;
import com.example.spring6_webApp.repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@AllArgsConstructor
@Service
public class AuthorServiceImp implements AuthorService {
    private final AuthorRepository authorRepository;

    @Override
    public Iterable<AuthorDTO> findAll() {
        ArrayList<AuthorDTO> authorsDTOs = new ArrayList<>();
        authorRepository.findAll()
                .forEach(author -> authorsDTOs.add(
                        AuthorMapper.INSTANCE.authorToAuthorDTO(author)
                ));
        return authorsDTOs;
    }
}