package com.workintech.library.main;

import com.workintech.library.design.*;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book  = new Book(1, "Hayvan Cıftlıgı", "George Orwell", "Can Yayınları", 50, 1, Category.CLASSICS, false);
        Book book1 = new Book(2, "Kucuk Prens", "Antoine de Saınt-Exupery", "Can Yayınları", 100, 2, Category.CLASSICS, false);
        Book book2 = new Book(3, "Mahşer", "Stephan King", "Can Yayınları", 90, 2, Category.HORROR, false);
        Book book3 = new Book(4, "Hababam Sınıfı Baskında", "Rıfat Ilgaz", "Can Yayınları", 100, 2, Category.COMICS, false);
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        Librarian librarian = new Librarian(1, "mert", "05368050686", 1234);
        Reader reader = new Reader(2, "ege", "05679050690");
        Reader reader1 = new Reader(3, "atakan", "05469380329");

        Scanner scanner = new Scanner(System.in);
        System.out.println("İşlem yapmak için password bilginizi giriniz.");
        int enteredPassword = scanner.nextInt();
        if (librarian.getPassword() == enteredPassword) {
            while (true) {
                try {
                    System.out.println("1 - Create new book");
                    System.out.println("2 - Remove book");
                    System.out.println("3 - Print all books");
                    System.out.println("4 - Search book by bookName");
                    System.out.println("5 - Update book");
                    System.out.println("6 - List book by category");
                    System.out.println("7 - Borrow book");
                    System.out.println("0 - Exit");
                    System.out.println("Yapmak istediğiniz işlemi giriniz: ");
                    int process = scanner.nextInt();
                    if (process < 0 || process > 7) {
                        System.out.println("Process must be between 0 to 7");
                    }
                    if (process == 0) {
                        System.exit(0);
                    } else if (process == 1) {
                        System.out.println("----------Create new book");
                        Scanner s = new Scanner(System.in);
                        System.out.println("Eklemek istediğiniz kitaba ait id bilgisini giriniz.");
                        int bookID = s.nextInt();
                        System.out.println("Lütfen kitabın ismini giriniz.");
                        String bookName = s.next();
                        System.out.println("Lütfen yazarın ismini giriniz.");
                        String authorName = s.next();
                        System.out.println("Lütfen yayının ismini giriniz.");
                        String publisherName = s.next();
                        System.out.println("Lütfen kitaba ait fiyat bilgisini giriniz.");
                        double price = s.nextDouble();
                        System.out.println("Lütfen kitaba ait edition bilgisini giriniz.");
                        int edition = s.nextInt();
                        System.out.println("Lütfen kitabın mevcut bilgisini giriniz.");
                        boolean isBorrowed = s.nextBoolean();
                        Book newBook = new Book(bookID, bookName, authorName, publisherName, price, edition, Category.CLASSICS, isBorrowed);
                        System.out.println("Added Book ID" + " : " + newBook.getBookID() + "," + " Book Name" + " : " + newBook.getBookName() + "," + " AuthorName " + ": " +
                                newBook.getAuthorName() + "," + " PublisherName" + " : " + newBook.getPublisherName() + "," + " Price" +
                                " : " + newBook.getPrice() + "," + " Edition" + " : " + newBook.getEdition());
                        library.addBook(newBook);
                    } else if (process == 2) {
                        System.out.println("----------Remove book");
                        Scanner s = new Scanner(System.in);
                        System.out.println("Çıkarmak istediğiniz kitaba ait id bilgisini giriniz.");
                        int bookID = s.nextInt();
                        System.out.println("Lütfen kitabın ismini giriniz.");
                        String bookName = s.next();
                        System.out.println("Lütfen yazarın ismini giriniz.");
                        String authorName = s.next();
                        System.out.println("Lütfen yayının ismini giriniz.");
                        String publisherName = s.next();
                        System.out.println("Lütfen kitaba ait fiyat bilgisini giriniz.");
                        double price = s.nextDouble();
                        System.out.println("Lütfen kitaba ait edition bilgisini giriniz.");
                        int edition = s.nextInt();
                        System.out.println("Lütfen kitabın mevcut bilgisini giriniz.");
                        boolean borrowed = s.nextBoolean();
                        Book currentBook = new Book(bookID, bookName, authorName, publisherName, price, edition, Category.COMICS, false);
                        System.out.println("Removed Book ID" + " : " + currentBook.getBookID() + "," + " Book Name" + " : " + currentBook.getBookName() + "," + " AuthorName " + ": " +
                                currentBook.getAuthorName() + "," + " PublisherName" + " : " + currentBook.getPublisherName() + "," + " Price" +
                                " : " + currentBook.getPrice() + "," + " Edition" + " : " + currentBook.getEdition());
                        library.removeBook(currentBook);
                    } else if (process == 3) {
                        System.out.println("-----printBooks");
                        library.printBooks();
                    } else if (process == 4) {
                        System.out.println("BookID: " + library.searchBook(book.getBookName()));
                    } else if (process == 5) {
                        System.out.println("----------Update book");
                        Scanner s = new Scanner(System.in);
                        System.out.println("Güncellemek istediğiniz kitaba ait id bilgisini giriniz.");
                        int bookID = s.nextInt();
                        System.out.println("Lütfen kitaba ait isim bilgisini giriniz.");
                        String bookName = s.next();
                        System.out.println("Lütfen yazarın ismini giriniz.");
                        String authorName = s.next();
                        System.out.println("Lütfen yayının ismini giriniz.");
                        String publisherName = s.next();
                        System.out.println("Lütfen kitaba ait fiyat bilgisini giriniz.");
                        double price = s.nextDouble();
                        System.out.println("Lütfen kitaba ait edition bilgisini giriniz.");
                        int edition = s.nextInt();
                        System.out.println("Lütfen kitabın mevcut bilgisini giriniz.");
                        boolean borrowed = s.nextBoolean();
                        Book oldBook = new Book(1, "Hayvan Cıftlıgı", "George Orwell", "Can Yayınları", 100, 2, Category.CLASSICS, false);
                        Book updatedBook = new Book(bookID, bookName, authorName, publisherName, price, edition, Category.ACTION, borrowed);
                        System.out.println("Updated Book ID" + " : " + updatedBook.getBookID() + "," + " Book Name" + " : " + updatedBook.getBookName() + "," + " AuthorName " + ": " +
                                updatedBook.getAuthorName() + "," + " PublisherName" + " : " + updatedBook.getPublisherName() + "," + " Price" +
                                " : " + updatedBook.getPrice() + "," + " Edition" + " : " + updatedBook.getEdition());
                        library.updateBook(oldBook, updatedBook);
                    } else if (process == 6) {
                        System.out.println("Print book by category " + library.printsBookByCategory(Category.CLASSICS));
                    } else if(process == 7) {
                        System.out.println("----------Borrow book");
                        Scanner s = new Scanner(System.in);
                        System.out.println("Kitabı ödünç alacak kullanıcıya ait id bilgisini giriniz.");
                        int readerID = s.nextInt();
                        System.out.println("Lütfen kullanıcının ismini giriniz.");
                        String readerName = s.next();
                        System.out.println("Lütfen kullanıcının telefon numarasını giriniz.");
                        String readerNumber = s.next();
                        System.out.println("Ödünç alınacak kitaba ait id bilgisini giriniz.");
                        int bookID = s.nextInt();
                        System.out.println("Lütfen kitabın ismini giriniz.");
                        String bookName = s.next();
                        System.out.println("Lütfen yazarın ismini giriniz.");
                        String authorName = s.next();
                        library.borrowBook(new Person(readerID, readerName, readerNumber), new Book(bookID, bookName, authorName));

                    }

                } catch (Exception ex) {
                    System.out.println("Invalid process " + ex.getMessage());
                    break;
                }
            }

        } else if(enteredPassword != 1234) {
            System.out.println("Password bilginiz doğru değil");
        }
    }

}