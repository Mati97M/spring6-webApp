package com.example.spring6_webApp.services;

import com.example.spring6_webApp.dto.AuthorDTO;

public interface AuthorService {
    Iterable<AuthorDTO> findAll();
}