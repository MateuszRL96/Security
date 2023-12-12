package pl.mkulec.demo.Product;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

//@CrossOrigin(origins = "localhost:4200")
@RestController
public class BookApi {


    @GetMapping("/api/books")
    public List<Book> get()
    {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Ugly Love", "Collen Hoover"));
        bookList.add(new Book("Listy zza swiatow", "Mroz"));

        return bookList;
    }
}
