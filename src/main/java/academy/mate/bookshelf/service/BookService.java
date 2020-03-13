package academy.mate.bookshelf.service;

import java.util.List;
import academy.mate.bookshelf.entity.Book;

public interface BookService {

    List<Book> showAll();

    Book findByTitle(String title);

    void add(Book book);

    void comment(Long id, String note);

    void remove(Long id);
}
