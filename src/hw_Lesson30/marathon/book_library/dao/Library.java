package hw_Lesson30.marathon.book_library.dao;

import hw_Lesson30.marathon.book_library.model.Book;

public interface Library {
    boolean addBook(Book book);
    Book removeBook(long isbn);
    Book findBook(long isbn);
    int quantity();
    void printBook();
}