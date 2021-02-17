package com.stepanova.details;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class SearchForm {
    WebDriver driver;
    By searchBox = By.cssSelector("#twotabsearchtextbox");
    By searchButton = By.xpath("//*[@id=\"searchDropdownBox\"]/option[6]");
    By name = By.cssSelector("#twotabsearchtextbox");
    String findWord = "java";
    By bookName = By.cssSelector("span.a-text-normal");
    By authorName = By.cssSelector("span:nth-child(2)");
    By price = By.cssSelector("span.a-offscreen");
    By bestseller = By.cssSelector("span:nth-child(2)");
    List<WebElement> elements;
    List<Book> listBooks = new ArrayList<Book>();
    Book javaBook;
    String nameJavaBook = "Head First Java, 2nd Edition 2nd Edition";

    public SearchForm(WebDriver driver) {
        this.driver = driver;
    }

    public void setBox() {
        driver.findElement(searchBox);
    }

    public void setButton() {
        driver.findElement(searchButton).click();
        driver.findElement(name).sendKeys(findWord + Keys.ENTER);
    }

    public List<Book> resultListWithBook() {
        WebElement element = driver.findElement(By.tagName("div"));
        elements = element.findElements(By.cssSelector("div.s-asin"));
        for (WebElement e : elements) {
            listBooks.add(new Book(e.findElement(bookName).getText(), e.findElement(authorName).getText(), e.findElements(price).toString(), e.findElement(bestseller).getText()));
        }
        return listBooks;
    }

    public Book findBook(List<Book> list) {
        for (Book b : list) {
            if (b.getNameBook().equals(nameJavaBook)) {
                return javaBook;
            }
        }
        return null;
    }
}
