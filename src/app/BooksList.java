package app;

import java.util.ArrayList;

public class BooksList {

    ArrayList<Book> booksList = new ArrayList<Book>();

    public ArrayList<Book> getBooksList() {
        return booksList;
    }

    public void addBookToList(Book book) {
        booksList.add(book);
    }
}
