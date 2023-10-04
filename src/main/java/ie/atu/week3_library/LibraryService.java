package ie.atu.week3_library;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibraryService {

    private List<Book> allBookTitles = new ArrayList<>();

    public void addBook(Book book) {
        //code to add books to the library
        allBookTitles.add(book);
        System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
        System.out.println("Released in: " + book.getPublishedYear());
        System.out.println("Isbn-10: " + book.getIsbn_10());
    }

    public List<Book> getBook() {
        //code to retrieve a list of all books in library
        System.out.println(allBookTitles);
        return allBookTitles;
    }


}


