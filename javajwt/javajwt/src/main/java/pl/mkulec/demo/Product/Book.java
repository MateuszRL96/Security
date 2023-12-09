package pl.mkulec.demo.Product;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

    private String tittle;

    private String author;

    public Book(String tittle, String author) {
        this.tittle = tittle;
        this.author = author;
    }
}
