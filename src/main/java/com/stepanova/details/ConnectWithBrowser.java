package com.stepanova.details;

import org.openqa.selenium.WebDriver;

public class ConnectWithBrowser {
    WebDriver driver;
    public SearchDetails search = new SearchDetails();
    public void initialized(){
        search.setBrowserName("https://www.amazon.com");
        driver.get(search.getBrowserName());
    }
    public ConnectWithBrowser(WebDriver driver) {
        this.driver = driver;
    }
}
