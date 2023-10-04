package ie.atu.week3_library;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {

    private String title;
    private String author;
    private int isbn;
    private int publishedYear;

}
