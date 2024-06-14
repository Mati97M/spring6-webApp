package com.example.spring6_webApp.mappers;

import com.example.spring6_webApp.domain.Book;
import com.example.spring6_webApp.dto.BookDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface BookMapper {
    BookMapper INSTANCE = Mappers.getMapper(BookMapper.class);

    BookDTO booktoBookDTO(Book book);
}