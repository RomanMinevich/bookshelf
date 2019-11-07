package academy.mate.bookshelf.controller;

import java.util.List;
import javax.validation.Valid;
import academy.mate.bookshelf.dto.BookDto;
import academy.mate.bookshelf.entity.Book;
import academy.mate.bookshelf.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shelf")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> showAll() {
        return bookService.showAll();
    }

    @GetMapping("/book")
    public Book findByTitle(@RequestParam String title) {
        return bookService.findByTitle(title);
    }

    @PostMapping
    public void add(@Valid @RequestBody BookDto bookDto) {
        bookService.add(new Book(bookDto));
    }

    @PutMapping("/{id}")
    public void comment(@PathVariable Long id, @RequestBody BookDto bookDto) {
        bookService.comment(id, bookDto.getNote());
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable Long id) {
        bookService.remove(id);
    }
}
