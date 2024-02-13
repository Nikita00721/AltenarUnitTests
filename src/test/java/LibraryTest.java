import org.example.Book;
import org.example.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @BeforeEach
    void setUp() {
        library = new Library();
        book1 = new Book("Title 1", "Author 1", true);
        book2 = new Book("Title 2", "Author 2", true);
        book3 = new Book("Title 3", "Author 3", false);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
    }

    @Test
    void testAddBook() {
        assertEquals(3, library.getAllBooks().size());
        Book newBook = new Book("New Book", "New Author", true);
        library.addBook(newBook);
        assertEquals(4, library.getAllBooks().size());
        assertTrue(library.getAllBooks().contains(newBook));
    }
}