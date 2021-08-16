import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import testbase.TestBase;

import java.util.List;

public class TestExercise4 extends TestBase {

    @Before
    public void setup(){
        super.setup();
        WebElement basicFormsButton = driver.findElement(By.linkText("Input Forms"));
        basicFormsButton.click();
        WebElement inputFormsButton = driver.findElement(By.linkText("Checkbox Demo"));
        inputFormsButton.click();
    }

    @Test
    public void testSingleCheckbox(){
        WebElement singleCheckbox = driver.findElement(By.id("isAgeSelected"));
        singleCheckbox.click();
        WebElement outPutText = driver.findElement(By.id("txtAge"));

        Assert.assertEquals("Success - Check box is checked", outPutText.getText());

    }

    @Test
    public void testMultipleCheckBox(){
        List<WebElement> checkBox = driver.findElements(By.className("cb1-element"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",checkBox.get(0));
        int size = checkBox.size();
        for (int i = 0; i < size; i++){
            checkBox.get(i).click();
            if (i == 2){
                Assert.assertEquals("Check All",driver.findElement(By.id("check1")).getAttribute("Value"));
            }

        }
        Assert.assertEquals("Uncheck All",driver.findElement(By.id("check1")).getAttribute("Value"));
    }

    @Test
    public void testCheckBoxCombination(){
        WebElement singleCheckbox = driver.findElement(By.id("isAgeSelected"));
        singleCheckbox.click();

        List<WebElement> checkBox = driver.findElements(By.className("cb1-element"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",checkBox.get(0));
        int size = checkBox.size();
        for (int i = 0; i < size; i++){
            checkBox.get(i).click();
            }
        Assert.assertEquals("Uncheck All",driver.findElement(By.id("check1")).getAttribute("Value"));
        }
    }
