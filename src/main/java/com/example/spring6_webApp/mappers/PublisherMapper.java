package com.example.spring6_webApp.mappers;

import com.example.spring6_webApp.domain.Publisher;
import com.example.spring6_webApp.dto.PublisherDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PublisherMapper {
    PublisherDTO publisherToPublisherDTO(Publisher publisher);
}