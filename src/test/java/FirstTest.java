import org.junit.*;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertTrue;

/**
 * Created by vkharitonov on 21.03.2016.
 */
public class FirstTest {

    public static FirefoxDriver driver;

    @BeforeClass
    public static void createDriver()
    {
        driver = new FirefoxDriver();
    }
    @Before
    public void openWebpage()
    {
        driver.get("http://the-internet.herokuapp.com");
    }
    @Test
    public void checkTheTitle_shouldFail()
    {
        assertTrue(driver.getTitle().equals("NOT THE INTERNET"));
    }
    @Test
    public void checkTheTitle_shouldPass()
    {
        assertTrue(driver.getTitle().equals("The Internet"));
    }
    @After
    public void printThePageTitle()
    {
        System.out.println("The title of the page is: " + driver.getTitle());
    }
    @AfterClass
    public static void closeBrowser()
    {
        driver.quit();
    }
}