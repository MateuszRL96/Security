package pl.mkulec.demo.Product;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookApi {


    @GetMapping()
    public List<Book> get()
    {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book("Ugly Love", "Collen Hoover"));
        bookList.add(new Book("Listy zza swiatow", "Mroz"));

        return bookList;
    }
}
