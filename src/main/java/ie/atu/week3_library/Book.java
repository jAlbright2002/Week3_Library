package ie.atu.week3_library;


import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Book {

    private String title;
    private String author;
    private int isbn_13;
    private int publishedYear;

}
