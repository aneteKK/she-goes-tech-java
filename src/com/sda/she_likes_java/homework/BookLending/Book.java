package com.sda.she_likes_java.homework.BookLending;

public class Book {

    private String author;
    private String title;
    private int publicationYear;
    private static int numberOfCreatedBooks;

    public Book(String author, String title, int publicationYear) {
        this.author = author;
        this.title = title;
        this.publicationYear = publicationYear;
        numberOfCreatedBooks++;
    }
    public static int getNumberOfCreatedBooks(){
        return numberOfCreatedBooks;
    }
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
