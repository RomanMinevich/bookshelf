package academy.mate.bookshelf.controller;

import javax.annotation.PostConstruct;
import academy.mate.bookshelf.entity.Book;
import academy.mate.bookshelf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    @Autowired
    private BookService bookService;

    @PostConstruct
    public void add() {
        bookService.add(new Book("Demons", "Fyodor Dostoevsky"));
        bookService.add(new Book("Angels & Demons", "Den Brown"));
    }

}
