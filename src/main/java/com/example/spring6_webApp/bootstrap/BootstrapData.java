package com.example.spring6_webApp.bootstrap;

import com.example.spring6_webApp.domain.Author;
import com.example.spring6_webApp.domain.Book;
import com.example.spring6_webApp.domain.Publisher;
import com.example.spring6_webApp.repository.AuthorRepository;
import com.example.spring6_webApp.repository.BookRepository;
import com.example.spring6_webApp.repository.PublisherRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class BootstrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) {
        //populating the repos
        Book NES = new Book();
        NES.setTitle("Never Ending Story");
        NES.setIsbn("12345");

        Book PLO = new Book();
        PLO.setTitle("Pan Lodowego Ogrodu");
        PLO.setIsbn("6789");

        Author michael = new Author();
        michael.setFirstName("Michael");
        michael.setLastName("Ende");
        michael.addBook(NES);

        Author jerzy = new Author();
        jerzy.setFirstName("Jerzy");
        jerzy.setLastName("grzedowicz");
        jerzy.addBook(PLO);

        Publisher publisher = new Publisher();
        publisher.setName("Word Factory");
        publisher.setCity("Warsaw");
        publisher.setAddress("Sesame Street");
        publisher.setState("Masovian Voivodeships");
        publisher.setZip("31-111");
        publisher.addBook(NES);
        publisher.addBook(PLO);

        authorRepository.save(jerzy);
        authorRepository.save(michael);
        publisherRepository.save(publisher);

        System.out.println("End of the program");

    }
}