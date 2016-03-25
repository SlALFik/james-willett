import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by vkharitonov on 24.03.2016.
 */

public class MyFirstWaitTests {

    public static FirefoxDriver driver;

    @BeforeClass
    public static void setupDriver ()
    {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before
    public void goToAccountPage ()
    {
        driver.get("http://store.demoqa.com/products-page/your-account/");
    }

    @Test
    public void findAnElement_ShouldPass()
    {
        WebElement loginField = driver.findElement(By.id("log"));
    }

    @Test
    public void findAnElement_ShouldFail()
    {
        WebElement someField = driver.findElement(By.id("doesNotExist"));
    }

    @AfterClass
    public static void quitDriver()
    {
        driver.quit();
    }

}
