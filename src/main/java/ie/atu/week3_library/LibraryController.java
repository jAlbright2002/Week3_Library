package ie.atu.week3_library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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


}
