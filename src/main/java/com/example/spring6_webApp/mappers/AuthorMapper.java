package com.example.spring6_webApp.mappers;

import com.example.spring6_webApp.domain.Author;
import com.example.spring6_webApp.dto.AuthorDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface AuthorMapper {
    AuthorDTO authorToAuthorDTO(Author author);
}