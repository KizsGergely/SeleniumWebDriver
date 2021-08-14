import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testbase.TestBase;

import java.util.concurrent.TimeUnit;

public class TestExercise2 extends TestBase {

    @Before
    public void setup(){
        super.setup();
        WebElement basicFormsButton = driver.findElement(By.linkText("Input Forms"));
        basicFormsButton.click();
        WebElement inputFormsButton = driver.findElement(By.linkText("Simple Form Demo"));
        inputFormsButton.click();
    }
    @Test
    public void testSimpleInputField(){


        WebElement inputField = driver.findElement(By.id("user-message"));
        inputField.sendKeys("TestString");
        WebElement showMessageButton = driver.findElement(By.xpath("//button[text()='Show Message']"));
        showMessageButton.click();
        WebElement showMessageOutcome = driver.findElement(By.id("display"));

        Assert.assertEquals("TestString", showMessageOutcome.getAttribute("innerText"));

//        driver.quit();

    }

    @After
    public void after(){
        super.after();
    }
}
