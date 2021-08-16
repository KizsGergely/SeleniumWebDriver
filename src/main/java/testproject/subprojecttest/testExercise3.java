package testproject.subprojecttest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

public class testExercise3 {

    @Test
    public void doubleInputFieldTest(WebDriver driver){
        driver.get("https://www.seleniumeasy.com/test/");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        WebElement xButton = driver.findElement(By.id("at-cv-lightbox-close"));
        xButton.click();
        WebElement basicFormsButton = driver.findElement(By.linkText("Input Forms"));
        basicFormsButton.click();
        WebElement inputFormsButton = driver.findElement(By.linkText("Simple Form Demo"));
        inputFormsButton.click();
        WebElement inputField1 = driver.findElement(By.id("sum1"));
        inputField1.sendKeys("1");
        WebElement inputField2 = driver.findElement(By.id("sum2"));
        inputField2.sendKeys("1");
        WebElement getTotalButton = driver.findElement(By.xpath("//button[text()='Get Total']"));
        getTotalButton.click();
        WebElement showMessageOutcome = driver.findElement(By.id("displayvalue"));

        Assert.assertEquals("2", showMessageOutcome.getAttribute("innerText"));
        inputField1.sendKeys("999999999999999999999999999999999999999999999999999");
        inputField2.sendKeys("999999999999999999999999999999999999999999999999999");
        getTotalButton.click();
        Assert.assertEquals("4e+51", showMessageOutcome.getAttribute("innerText"));
        driver.quit();


    }
}
