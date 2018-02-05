package hu.helixlab.spring.service;

import hu.helixlab.spring.domain.Book;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    public Book getTestBook(){
        Book book = new Book();
        book.setId(1003);
        book.setName("Spring MVC ver. 3.2");
        book.setIsbn("ASDFG012334");
      return book;
    }
}
