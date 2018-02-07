package hu.helixlab.spring.service;

import hu.helixlab.spring.domain.Book;
import hu.helixlab.spring.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book findById(int id) {
        return bookRepository.findOne(id);
    }


    public Book save(Book book) {

        return bookRepository.save(book);
    }

    public Book getTestBook() {
        Book book = new Book();
        book.setId(1003);
        book.setName("Spring MVC ver. 3.2");
        book.setIsbn("ASDFG012334");
        return book;
    }

    public void deleteById(int id) {

        bookRepository.delete(id);
    }

    public Book updateBookById(int id, Book newBook) {
        Book oldbook = bookRepository.findOne(id);
        oldbook.setName(newBook.getName());
        oldbook.setIsbn(newBook.getIsbn());
        return bookRepository.save(oldbook);

    }
}