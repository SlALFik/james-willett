import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by vkharitonov on 24.03.2016.
 */
public class FailingImplicitWaitTest {
    public static FirefoxDriver driver;

    @BeforeClass
    public static void createDriver()
    {
        driver = new FirefoxDriver();
    }


    @Test
    public void failingImplicitWaitTest()
    {
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com/dynamic_loading/2");

        WebElement startButton = driver.findElement(By.cssSelector("#start>button"));

        startButton.click();

        WebElement helloWorldText = driver.findElement(By.id("finish"));
    }

    @AfterClass
    public static void quitDriver ()
    {
        driver.quit();
    }

}
