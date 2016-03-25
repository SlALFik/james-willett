/**
 * Created by vkharitonov on 23.03.2016.
 */


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.Assert.assertTrue;

public class MyFirstChromeTest {

    @BeforeClass
    public static void setupChromeDriverLocation() {
        String chromeDriverLocation = "D:/project/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
    }

    @Test
    public void basicChromeUsage() {
        WebDriver chrome = new ChromeDriver();
        chrome.get("http://the-internet.herokuapp.com/");
        assertTrue(chrome.getTitle().equals("The Internet"));
        chrome.quit();
    }


    @Test
    public void basicChromeDriverOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("disable-plugins");
        options.addArguments("disable-extensions");
        WebDriver chrome = new ChromeDriver(options);
        chrome.get("http://the-internet.herokuapp.com/");
        assertTrue(chrome.getTitle().equals("The Internet"));
        chrome.quit();
    }

}