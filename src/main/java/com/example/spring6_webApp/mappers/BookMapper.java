package com.example.spring6_webApp.mappers;

import com.example.spring6_webApp.domain.Book;
import com.example.spring6_webApp.dto.BookDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookDTO booktoBookDTO(Book book);
}