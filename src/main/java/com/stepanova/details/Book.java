package com.stepanova.details;

import java.util.Objects;

public class Book {
    private String nameBook;
    private String author;
    private String bestseller;
    private String price;

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

    public String getNameBook() {
        return nameBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameBook, book.nameBook) &&
                Objects.equals(author, book.author) &&
                Objects.equals(bestseller, book.bestseller) &&
                Objects.equals(price, book.price);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", author='" + author + '\'' +
                ", bestseller='" + bestseller + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
