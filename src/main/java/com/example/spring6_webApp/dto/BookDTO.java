package com.example.spring6_webApp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public final class BookDTO {
    private Long id;
    private String title;
    private String isbn;
    private String publisher;
}