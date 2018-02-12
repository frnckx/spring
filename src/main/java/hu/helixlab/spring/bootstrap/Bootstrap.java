package hu.helixlab.spring.bootstrap;

import hu.helixlab.spring.domain.Author;
import hu.helixlab.spring.domain.Book;
import hu.helixlab.spring.domain.Category;
import hu.helixlab.spring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

import java.util.UUID;

public class Bootstrap implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {

    }

    private void init() {
        Book book = new Book();
        book.setIsbn(String.valueOf(UUID.randomUUID()));
        book.setName("Java course I.");
        Category category = new Category();
        Author author = new Author();
        author.setName("Béla");
        author.setAge(32);
        author.setEmail("bela@gmail.com");
        book.addAuthor(author);
        category.setName("Horror");
        category.setShortDescription("Very scary books for brave men");
        book.addCategory(category);

       bookRepository.save(book);
    }


}
