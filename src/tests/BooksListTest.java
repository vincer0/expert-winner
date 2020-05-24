package tests;

import app.Book;
import app.BooksList;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BooksListTest {

    private BooksList booksList;

    @BeforeEach
    public void instantiate() {
        booksList = new BooksList();
    }

    @Test
    public void testAddBookToList() {
        Book book = new Book("Titile1", "Simple Author", 16.75);

        assertEquals(0, booksList.getBooksList().size());

        booksList.addBookToList(book);

        assertEquals(1, booksList.getBooksList().size());

    }
}
