package academy.mate.bookshelf.dto;

import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class BookDto {
    private final String title;
    private final String author;
    private String note;

    public BookDto(@NotEmpty String title, @NotEmpty String author) {
        this.title = title;
        this.author = author;
    }
}
