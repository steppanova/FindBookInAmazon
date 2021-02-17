package com.stepanova.details;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class FindBookDemo {
    SearchDetails search = new SearchDetails();
    By bookName = By.cssSelector("span.a-text-normal");
    By authorName = By.cssSelector("span:nth-child(2)");
    By price = By.cssSelector("span.a-offscreen");
    By bestseller = By.cssSelector("span:nth-child(2)");
    List<WebElement> elements;
    WebDriver driver;
    List<Book> listBook = new ArrayList<Book>();
    Book java;
    String nameBook = "Head First Java, 2nd Edition 2nd Edition";

    public void findBrowse() {
        System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
        driver= new ChromeDriver();
        search.setBrowserName("https://www.google.com");
        driver.navigate().to("https://www.amazon.com/Head-First-Java-Kathy-Sierra/dp/0596009208/ref=sr_1_2?dchild=1&keywords=Java&qid=1610356790&s=books&sr=1-2");

    }
    public List<Book> resultList(){
        WebElement element = driver.findElement(By.xpath("//*[@id=\"dp\"]"));
        elements = element.findElements(By.cssSelector("#dp-container"));
        for (WebElement e : elements) {
            listBook.add(new Book(e.findElement(bookName).getText(), e.findElement(authorName).getText(), e.findElements(price).toString(), e.findElement(bestseller).getText()));
        }
        return listBook;
    }
    public Book find(List<Book> lists) {
        for (Book b : lists) {
            if (b.getNameBook().equals(nameBook)) {
                return java;
            }
        }
        return null;
    }
}
