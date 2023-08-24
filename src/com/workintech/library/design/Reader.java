package com.workintech.library.design;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person {
    private List<Book> book;
    public Reader(int id, String name, String phoneNumber) {
        super(id, name, phoneNumber);
    }
    public Reader(int id, String name, String phoneNumber, List<Book> book) {
        super(id, name, phoneNumber);
        book = new ArrayList<>();
    }
    public List<Book> getBook() {
        return book;
    }

}
