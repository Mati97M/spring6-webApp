package com.example.spring6_webApp.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @EqualsAndHashCode.Include
    private Long id;
    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Set<Book> books = new HashSet<>();
}
