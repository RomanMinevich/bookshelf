package academy.mate.bookshelf.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookDto {
    @NotEmpty
    private final String title;
    @NotEmpty
    private final String author;
    private String note;
}
