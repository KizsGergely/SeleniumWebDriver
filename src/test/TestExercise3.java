import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import testbase.TestBase;

import java.util.concurrent.TimeUnit;

public class TestExercise3 extends TestBase {

    @Before
    public void setup(){
        super.setup();
        WebElement basicFormsButton = driver.findElement(By.linkText("Input Forms"));
        basicFormsButton.click();
        WebElement inputFormsButton = driver.findElement(By.linkText("Simple Form Demo"));
        inputFormsButton.click();
    }


    @Test
    public void testDoubleInputField(){
        WebElement inputField1 = driver.findElement(By.id("sum1"));
        inputField1.sendKeys("1");
        WebElement inputField2 = driver.findElement(By.id("sum2"));
        inputField2.sendKeys("1");
        WebElement getTotalButton = driver.findElement(By.xpath("//button[text()='Get Total']"));
        getTotalButton.click();
        WebElement showMessageOutcome = driver.findElement(By.id("displayvalue"));

        Assert.assertEquals("2", showMessageOutcome.getAttribute("innerText"));

    }

    @Test
    public void testDoubleInputFieldWithLargeInteger(){
        WebElement inputField1 = driver.findElement(By.id("sum1"));
        WebElement inputField2 = driver.findElement(By.id("sum2"));
        WebElement getTotalButton = driver.findElement(By.xpath("//button[text()='Get Total']"));
        WebElement showMessageOutcome = driver.findElement(By.id("displayvalue"));

        inputField1.sendKeys("999999999999999999999999999999999999999999999999999");
        inputField2.sendKeys("999999999999999999999999999999999999999999999999999");
        getTotalButton.click();
        Assert.assertEquals("2e+51", showMessageOutcome.getText());
    }


    public void after(){
        super.after();
    }
}
