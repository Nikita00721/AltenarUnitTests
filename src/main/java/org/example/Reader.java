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

    public void borrowBook(Book book) { // читатель берет книгу
        if (book.isAvailable()) {
            book.setAvailable(false);
            borrowedBooks.add(book);
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Book " + book.getTitle() + " is not available.");
        }
    }

    public void returnBook(Book book) { // возвращает книгу
        if (borrowedBooks.contains(book)) {
            book.setAvailable(true);
            borrowedBooks.remove(book);
            System.out.println(name + " returned the book: " + book.getTitle());
        } else {
            System.out.println(name + " didn't borrow the book: " + book.getTitle());
        }
    }

    public List<Book> getBorrowedBooks() { // получение списка взятых книг
        return borrowedBooks;
    }

    public boolean hasBorrowedBook(Book book) { // взята ли книга?
        return borrowedBooks.contains(book);
    }

    public void returnAllBooks() { // возврат всех взятых книг
        for (Book book : borrowedBooks) {
            book.setAvailable(true);
        }
        borrowedBooks.clear();
        System.out.println(name + " returned all borrow books");
    }

    public void displayBorrowedBooks() { // показать список (в нормальном виде) всех взятых книг
        System.out.println(name + " borrow book:");
        for (Book book : borrowedBooks) {
            System.out.println("- " + book.getTitle() + " author " + book.getAuthor());
        }
    }
}