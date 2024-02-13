package org.example;

import java.util.ArrayList;
import java.util.List;

public class Reader {
    private String name;
    private List<Book> borrowedBooks;

    public Reader(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<>();
    }
}