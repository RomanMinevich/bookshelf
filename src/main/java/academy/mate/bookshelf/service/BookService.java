package academy.mate.bookshelf.service;

import java.util.List;
import academy.mate.bookshelf.entity.Book;

public interface BookService {

    List<Book> showAll();

    Book findById(Long id);

    Book findByTitle(String title);

    void add(Book book);

    Book comment(Book book);

    void remove(Book book);
}
