package com.example.spring6_webApp.bootstrap;

import com.example.spring6_webApp.domain.Author;
import com.example.spring6_webApp.domain.Book;
import com.example.spring6_webApp.domain.Publisher;
import com.example.spring6_webApp.repository.AuthorRepository;
import com.example.spring6_webApp.repository.BookRepository;
import com.example.spring6_webApp.repository.PublisherRepository;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class BootstrapData implements CommandLineRunner {
    private static final Logger log = LoggerFactory.getLogger(BootstrapData.class);
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Override
    public void run(String... args) throws Exception {
        //populating the repos
        Author michael = new Author();
        michael.setFirstName("Michael");
        michael.setLastName("Ende");

        Book NES = new Book();
        NES.setTitle("Never Ending Story");
        NES.setIsbn("12345");

        michael.getBooks().add(NES);
        NES.getAuthors().add(michael);
        authorRepository.save(michael);
        bookRepository.save(NES);

        Author jerzy = new Author();
        jerzy.setFirstName("Jerzy");
        jerzy.setLastName("grzedowicz");

        Book PLO = new Book();
        PLO.setTitle("Pan Lodowego Ogrodu");
        PLO.setIsbn("6789");

        jerzy.getBooks().add(PLO);
        PLO.getAuthors().add(jerzy);
        authorRepository.save(jerzy);
        bookRepository.save(PLO);

        Publisher publisher = new Publisher();
        publisher.setName("Word Factory");
        publisher.setCity("Warsaw");
        publisher.setAddress("Sesame Street");
        publisher.setState("Masovian Voivodeships");
        publisher.setZip("31-111");
        Publisher savedPublisher = publisherRepository.save(publisher);

        NES.setPublisher(publisher);
        PLO.setPublisher(publisher);
        bookRepository.save(NES);
        bookRepository.save(PLO);

        savedPublisher.getBooks().add(NES);
        savedPublisher.getBooks().add(PLO);
        publisherRepository.save(savedPublisher);

    }
}
