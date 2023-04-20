package com.sda.she_likes_java.homework.BookLending;

import com.sda.she_likes_java.static_modifier.WashMachine;

import java.util.Random;

public class BookLendingTest {

    public static void main(String[] args) {
        Book book1 = new Book("Haruki Murakami", "A Wild Sheep Chase", 1989);
        Book book2 = new Book("Viks", "Tīdžerēns Ņuks", 1995);
        Book book3 = new Book("J.K. Rowling", "Hary Potter and the Phylosophers stone", 1997);


        Random randomNumberOfBooks = new Random();


        for (int i = randomNumberOfBooks.nextInt(50); i > 0; i--) {
            makeSomeBooks();
        }
        System.out.println("Number of books created = " + Book.getNumberOfCreatedBooks());
    }

    public static void makeSomeBooks() {
        new Book("Emilija Kalderauska", "Emilijas piedzivojumi", 2018);
    }


}
