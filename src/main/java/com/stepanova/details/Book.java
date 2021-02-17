package com.stepanova.details;

public class Book {
    private String nameBook;
    private String author;
    private String bestseller;
    private String price;

    public Book(String nameBook, String author, String bestseller, String price) {
        this.nameBook = nameBook;
        this.author = author;
        this.bestseller = bestseller;
        this.price = price;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBestseller() {
        return bestseller;
    }

    public void setBestseller(String bestseller) {
        this.bestseller = bestseller;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

}
