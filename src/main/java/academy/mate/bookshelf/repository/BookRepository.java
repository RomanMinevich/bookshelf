package academy.mate.bookshelf.repository;


import java.util.Optional;
import academy.mate.bookshelf.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

    Optional<Book> findByTitle(String title);
}
