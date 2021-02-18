import com.stepanova.details.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class FindBookDemoTest {
    SearchResultPage page  = new SearchResultPage();
    FindBookDemo webDemo = new FindBookDemo();
    List<Book> result;
    String bookName = "Effective Java";
    @BeforeTest
    public void beforeTest() {
        page.initialized();
        result = page.resultListWithBook();
        webDemo.findBrowse();
        webDemo.resultList();
    }
    @Test
    public void findInBrowse(){
        List<Book> resultItem = webDemo.resultList();
        Assert.assertTrue(page.findBook(result,bookName), webDemo.find(resultItem,bookName));
    }
}
