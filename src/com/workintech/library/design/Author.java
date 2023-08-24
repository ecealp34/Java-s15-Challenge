package com.workintech.library.design;

import java.util.HashSet;
import java.util.Set;

public class Author extends Person{
    private Set<Book> books;

    public Author(int id, String name, String phoneNumber) {
        super(id, name, phoneNumber);
        books = new HashSet<>();
    }
    public Set<Book> getBooks() {
        return books;
    }
    public boolean addNewBook(Book book) {
        if(!books.contains(book)) {
            books.add(book);
            return true;
        }
        return false;
    }
}
