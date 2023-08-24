package com.workintech.library.design;

import java.util.*;

public class Book {
    private int bookID;
    private String bookName, authorName, publisherName;
    private double price;
    private int edition;
    private Category category;
    private boolean borrowed;

    public Book(int bookID, String bookName, String authorName, String publisherName, double price, int edition, Category category, boolean borrowed) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.price = price;
        this.edition = edition;
        this.category = category;
        this.borrowed = borrowed;
    }
    public Book(int bookID, String bookName, String authorName) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    public Book(String bookName) {
        this.bookName = bookName;
    }

    public Book() {
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getEdition() {
        return edition;
    }

    public void setEdition(int edition) {
        this.edition = edition;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setToBorrowed() {
        this.borrowed = true;
    }
    public void setToReturned() {
        this.borrowed = false;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public static Book createBook(int bookID, String bookName, String authorName, String publisherName, double price, int edition, Category category, boolean isBorrowed) {
        return new Book(bookID, bookName, authorName, publisherName, price, edition, category, isBorrowed);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book books = (Book) o;
        return bookID == books.bookID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookID);
    }

    @Override
    public String toString() {
        return "Book = {" +
                "bookID = " + bookID +
                ", bookName = '" + bookName + '\'' +
                ", authorName = '" + authorName + '\'' +
                ", publisherName = '" + publisherName + '\'' +
                ", price = " + price +
                ", edition = " + edition +
                ", category = " + category +
                ", borrowed = " + borrowed +
                '}';
    }
}
