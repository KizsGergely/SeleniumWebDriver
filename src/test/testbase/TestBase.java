package testbase;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    @Before
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement xButton = driver.findElement(By.id("at-cv-lightbox-close"));
        xButton.click();
    }

    @After
    public void after(){
        driver.quit();
    }
}
