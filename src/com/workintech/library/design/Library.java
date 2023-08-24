package com.workintech.library.design;

import java.util.*;

public class Library implements Processable{
    private static ArrayList<Book> books;
    private List<Reader> readers;
    private Map<Book, Person> borrowedBook;

    public Library() {
        books = new ArrayList<>();
        borrowedBook = new HashMap<>();
    }

    @Override
    public boolean addBook(Book book) {
        if(book != null ){
            books.add(book);
        }
        //bookSorted(book);
        System.out.println(books);
        return true;
    }

    @Override
    public boolean removeBook(Book currentBook) {
        if(currentBook != null || books.contains(currentBook) ){
            books.remove(currentBook);
        }
        System.out.println(books);
        return true;
    }

    @Override
    public boolean updateBook(Book oldBook, Book updatedBook) {
        if(books.contains(oldBook)) {
            oldBook.setPrice(updatedBook.getPrice());
            oldBook.setEdition(updatedBook.getEdition());
            books.add(updatedBook);
            System.out.println(books);

            return true;
        }
        return false;
    }

    @Override
    public int searchBook(String bookName) {
        System.out.println("Aradığınız kitabın ismini giriniz.");
        Scanner s = new Scanner(System.in);
        bookName = s.nextLine();
        for(Book book: books) {
            if(book.getBookName().equals(bookName)) {
                return books.indexOf(book);
            }

        }
        return -1;
    }

    @Override
    public List<Book> printsBookByCategory(Category category) {
        List<Book> categoryBook = new LinkedList<>();
        for(Book book : books) {
            if(book.getCategory().equals(category)) {
                categoryBook.add(book);
            }
        }
        return categoryBook;
    }

    public void printBooks() {
        for(int i = 0; i < books.size(); i++) {
            System.out.println(i + ": " + books.get(i).getBookName() + " by " + books.get(i).getAuthorName());
        }
        System.out.println(books);
    }

    public void borrowBook(Person person, Book book) {
        for(Book b: books) {
            if(!b.isBorrowed()) {
                b.setToBorrowed();
                 if(borrowedBook.size() < 5) {
                    borrowedBook.put(book, person);
                    System.out.println(person.getId() + "id'li " + person.getName() +  "kullanıcı" + book.getBookName() + " kitabını aldı.") ;
                } else if(borrowedBook.size() == 5) {
                     System.out.println("Maximum 5 tane kitap alabilirsiniz");
                 }
            }
        }
        System.out.println("Bütün kitaplar alınmış.");
    }

    public void returnBook(Book book) {
        for(Book b: books) {
            if(b.isBorrowed()) {
                b.setToReturned();
                System.out.println("Kitabınızın geri alım işlemi yapıldı.");
            }
        }
        System.out.println("İşleminiz yapılamadı.");
    }

}




