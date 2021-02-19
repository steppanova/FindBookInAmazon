import com.stepanova.details.*;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.List;

public class FindBookDemoTest {
    SearchResultPage page  = new SearchResultPage();
    FindBookDemo bookAtLink = new FindBookDemo();
    List<Book> result;
    String bookName = "Effective Java";
    @BeforeTest
    public void beforeTest() {
        page.connectionWithBrowse();
        bookAtLink.findLink();
        bookAtLink.resultList();
    }
    @Test
    public void findInBrowse(){
        result = page.resultListWithBook();
        List<Book> resultItem = bookAtLink.resultList();
        Assert.assertTrue(page.findBook(result,bookName), bookAtLink.find(resultItem,bookName));
    }
    @AfterTest
    public void afterTest(){
        page.closed();
        bookAtLink.closeDriver();
    }
}
