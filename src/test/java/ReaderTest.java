import org.example.Book;
import org.example.Reader;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReaderTest {
    private Reader reader;
    private Book book1;
    private Book book2;

    @BeforeEach
    void setUp() {
        reader = new Reader("Nikita Kremnev");
        book1 = new Book("Title 1", "Author 1", true);
        book2 = new Book("Title 2", "Author 2", false);
    }
}