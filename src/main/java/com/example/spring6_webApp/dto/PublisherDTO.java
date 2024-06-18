package com.example.spring6_webApp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
public class PublisherDTO {
    private Long id;
    private String name;
    private String address;
    private String city;
    private String state;
    private String zip;
    private Set<BookDTO> books;
}