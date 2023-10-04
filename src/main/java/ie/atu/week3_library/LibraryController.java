package ie.atu.week3_library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    private LibraryService ls;

    @Autowired
    public void setService(LibraryService ls) {
        this.ls  = ls;
    }

    @PostMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    public String addBookToLibrary(@RequestBody Book book) {
        ls.addBook(book);
        return "Book added.";
    }

    @GetMapping("get")
    public List<Book> getAllBooks() {
        return ls.getBook();
    }


}
