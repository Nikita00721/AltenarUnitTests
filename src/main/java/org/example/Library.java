package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) { // добавление книги в библиотеку
        books.add(book);
    }

    public void removeBook(Book book) { // удаление книги из библиотеки
        books.remove(book);
    }

    public List<Book> getAllBooks() { // получение списка всех книг в библиотеке
        return books;
    }

    public boolean isBookAvailable(Book book) { // проверка доступности книги
        return book.isAvailable();
    }

    public List<Book> searchBooks(String query) { // поиск книги по названию и/или автору
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getTitle().contains(query) || book.getAuthor().contains(query)) {
                result.add(book);
            }
        }
        return result;
    }
}