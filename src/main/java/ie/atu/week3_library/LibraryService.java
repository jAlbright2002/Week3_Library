package ie.atu.week3_library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {

    public void addBook(Book book) {
        //code to add books to the library
        System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor());
        System.out.println("Released in: " + book.getPublishedYear());
        System.out.println("Isbn-13: " + book.getIsbn_13());
    }

    public void getBook() {
        //code to retrieve a list of all books in library
    }


}


