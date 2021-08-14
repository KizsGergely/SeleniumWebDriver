package testproject;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.xpath.XPath;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class testExercise1 {

    @Test
    public void simpleFormDemoTest(WebDriver driver){
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement xButton = driver.findElement(By.id("at-cv-lightbox-close"));
        xButton.click();
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_ESCAPE);
        WebElement basicFormsButton = driver.findElement(By.linkText("Input Forms"));
        basicFormsButton.click();
        WebElement inputFormsButton = driver.findElement(By.linkText("Simple Form Demo"));
        inputFormsButton.click();
//        driver.quit();
    }

}
