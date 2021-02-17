import com.stepanova.details.Book;
import com.stepanova.details.ConnectWithBrowser;
import com.stepanova.details.FindBookDemo;
import com.stepanova.details.SearchForm;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class FindBookDemoTest {
    FindBookDemo webDriver = new FindBookDemo();
    SearchForm searchForm;
    ConnectWithBrowser page;
    List<Book> result;
    WebDriver driver;
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "E:\\ChromeDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        page = new ConnectWithBrowser(driver);
        page.initialized();
        webDriver.findBrowse();

        webDriver.resultList();
        searchForm = new SearchForm(driver);
        searchForm.setBox();
        searchForm.setButton();
        result = searchForm.resultListWithBook();
    }
    @Test
    public void findInBrowse(){
        List<Book> resultItem = webDriver.resultList();
        Assert.assertEquals(searchForm.findBook(result),  webDriver.find(resultItem));
    }
    @AfterTest
    public void afterSuite() {
        driver.quit();
    }
}
