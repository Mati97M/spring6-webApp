package com.example.spring6_webApp.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public final class AuthorDTO {
    private Long id;
    private String firstName;
    private String lastName;
}