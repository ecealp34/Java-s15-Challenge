package com.workintech.library.design;

import java.util.List;

public interface Processable {
    boolean addBook(Book book);
    boolean removeBook(Book currrentBook);
    boolean updateBook(Book oldBook, Book updatedBook);
    int searchBook(String bookName);
    List<Book> printsBookByCategory(Category category);
    void borrowBook(Person person, Book book);
}
