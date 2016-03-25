import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import static com.thoughtworks.selenium.SeleneseTestNgHelper.assertEquals;
import static junit.framework.TestCase.assertTrue;

/**
 * Created by vkharitonov on 24.03.2016.
 */
public class MyFirstAssertionTests {

    public static FirefoxDriver driver;

    @BeforeClass
    public static void setupDriver ()
    {
        driver = new FirefoxDriver();
    }

    @Before
    public void goToAccountPage()
    {
        driver.get("http://store.demoqa.com/products-page/your-account/");
    }

    @Test
    public void assertTrue_PageTitle()
    {
        assertTrue(driver.getTitle().equals("Your Account | ONLINE STORE"));
    }

    @Test
    public void assertTrue_PageTitleFail()
    {
        assertTrue("Error with page title on 'Your Account' page", driver.getTitle().equals("Some dummy text"));
    }


    @Test
    public void assertEquals_FromTitle()
    {
        WebElement youAccountLabel = driver.findElement(By.className("entry-title"));
        String youAccountLabelText = youAccountLabel.getText();
        assertEquals (youAccountLabelText, "Your Account");
    }

    @AfterClass
    public static void quitDriver()
    {
        driver.quit();
    }

}
