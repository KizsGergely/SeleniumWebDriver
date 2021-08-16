package testproject.subprojecttest;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class testExercise2 {

    @Test
    public void singleInputFieldTest(WebDriver driver){
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement xButton = driver.findElement(By.id("at-cv-lightbox-close"));
        xButton.click();
        WebElement basicFormsButton = driver.findElement(By.linkText("Input Forms"));
        basicFormsButton.click();
        WebElement inputFormsButton = driver.findElement(By.linkText("Simple Form Demo"));
        inputFormsButton.click();
        WebElement inputField = driver.findElement(By.id("user-message"));
        inputField.sendKeys("TestString");
        WebElement showMessageButton = driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessageButton.click();
        WebElement showMessageOutcome = driver.findElement(By.id("display"));

        Assert.assertEquals("TestString", showMessageOutcome.getAttribute("innerText"));

        driver.quit();


    }

}
