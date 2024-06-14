package com.example.spring6_webApp.mappers;

import com.example.spring6_webApp.domain.Book;
import com.example.spring6_webApp.dto.BookDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BookMapper {
    BookDTO booktoBookDTO(Book book);
}