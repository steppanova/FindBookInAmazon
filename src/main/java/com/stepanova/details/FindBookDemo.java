package com.stepanova.details;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;

public class FindBookDemo {
    WebDriver driver;
    List<Book> listBook = new ArrayList<>();
    String nameBook = "//div[contains(@id, 'titleblock_feature_div')]//h1/span[contains(@id, 'productTitle')]";
    String nameAuthor = "//div[contains(@id, 'bylineInfo_feature_div')]//span[contains(@class, 'a-declarative')]";
    String priceBook = "//span[contains(@class, 'a-size-base mediaTab_subtitle')]";
    String isBestSeller = "//div[contains(@id, 'averageCustomerReviews_feature_div')]//span[contains(@id, 'acrPopover')]";
    By bookName = By.xpath(nameBook);
    By authorName = By.xpath(nameAuthor);
    By price = By.xpath(priceBook);
    By bestseller = By.xpath(isBestSeller);
    String nameFindBook;

    public void findLink() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/Head-First-Java-Kathy-Sierra/dp/0596009208/ref=sr_1_2?dchild=1&keywords=Java&qid=1610356790&s=books&sr=1-2");
    }

    public String getBooksName() {
        WebElement element = driver.findElement(bookName);
        return element.getText();
    }

    public String getBooksAuthor() {

        WebElement element = driver.findElement(authorName);
        return element.getText();
    }

    public String getBooksPrice() {
        WebElement element = driver.findElement(price);
        return element.getText();
    }

    public String getBooksIsBestseller() {
        WebElement element = driver.findElement(bestseller);
        return element.getText();
    }

    public List<Book> resultList() {

        Book book = new Book();
        book.setNameBook(getBooksName());
        book.setAuthor(getBooksAuthor());
        book.setPrice(getBooksPrice());
        book.setBestseller(getBooksIsBestseller());

        listBook.add(book);

        return listBook;
    }

    public String find(List<Book> lists, String name) {

        for (Book book : lists) {
            if (book.getNameBook().equals(name)) {
                nameFindBook= book.getNameBook();
            }
        }
        return nameFindBook;
    }
    public void closeDriver(){
        driver.close();
    }
}
