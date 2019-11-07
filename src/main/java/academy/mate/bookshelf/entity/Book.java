package academy.mate.bookshelf.entity;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import academy.mate.bookshelf.dto.BookDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "books")
public class Book {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    private String title;
    private String author;
    @Column(length = 1500)
    private String note;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(BookDto bookDto) {
        this.title = bookDto.getTitle();
        this.author = bookDto.getAuthor();
        this.note = bookDto.getNote();
    }
}
