package com.example.spring6_webApp.bootstrap;

import com.example.spring6_webApp.domain.Author;
import com.example.spring6_webApp.domain.Book;
import com.example.spring6_webApp.repository.AuthorRepository;
import com.example.spring6_webApp.repository.BookRepository;
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

    @Override
    public void run(String... args) throws Exception {
        //populating the repos
        Author michael = new Author();
        michael.setFirstName("Michael");
        michael.setLastName("Ende");
        Author miachaelSaved = authorRepository.save(michael);

        Book NES = new Book();
        NES.setTitle("Never Ending Story");
        NES.setIsbn("12345");
        Book NESSaved = bookRepository.save(NES);

        Author jerzy = new Author();
        jerzy.setFirstName("Jerzy");
        jerzy.setLastName("grzedowicz");
        Author jerzySaved = authorRepository.save(jerzy);

        Book PLO = new Book();
        PLO.setTitle("Pan Lodowego Ogrodu");
        PLO.setIsbn("6789");
        Book PLOSaved = bookRepository.save(PLO);

        miachaelSaved.getBooks().add(NESSaved);
        jerzySaved.getBooks().add(PLOSaved);

        authorRepository.save(miachaelSaved);
        authorRepository.save(jerzySaved);

        log.info("Authors count: " + authorRepository.count());
        log.info("Books count: " + bookRepository.count());

    }
}
