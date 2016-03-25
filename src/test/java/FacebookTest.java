import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by vkharitonov on 24.03.2016.
 */
public class FacebookTest {

    public static FirefoxDriver driver;
    @BeforeClass
    public static void setupDriver()
    {
        driver = new FirefoxDriver();
    }

    @Test
    public void clickLoginButtonOnFacebook()
    {
        driver.get("https://www.facebook.com/");
        WebElement loginButton = driver.findElement(By.id("loginbutton"));
        loginButton.click();
    }

    @AfterClass
    public static void quitDriver()
    {
        driver.quit();
    }

}
