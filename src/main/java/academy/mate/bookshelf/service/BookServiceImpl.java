package academy.mate.bookshelf.service;

import java.util.List;
import javax.persistence.EntityNotFoundException;
import academy.mate.bookshelf.entity.Book;
import academy.mate.bookshelf.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> showAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findByTitle(String title) {
        return bookRepository.findByTitle(title)
                .orElseThrow(() -> new EntityNotFoundException(
                        "There is no such book on my bookshelf("));
    }

    @Override
    public void add(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void comment(Long id, String note) {
        Book book = findById(id);
        book.setNote(note);
        bookRepository.save(book);
    }

    @Override
    public void remove(Long id) {
        bookRepository.deleteById(id);
    }

    private Book findById(Long id) {
        return bookRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Wrong ID!"));
    }
}
