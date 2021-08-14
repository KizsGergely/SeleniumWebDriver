import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testbase.TestBase;

import java.util.List;

public class TestExercise6 extends TestBase {

    @Before
    public void setup(){
        super.setup();
        driver.findElement(By.linkText("Input Forms")).click();
        driver.findElement(By.linkText("Radio Buttons Demo")).click();
}

    @Test
    public void testRadioButtonDemo(){
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.id("buttoncheck")).click();
        Assert.assertEquals("Radio button 'Male' is checked",driver.findElement(By.className("radiobutton")).getAttribute("innerText"));
    }

    @Test
    public void testGroupRadioButtonDemo(){
        List<WebElement> sexButtons = driver.findElements(By.name("gender"));
        List<WebElement> ageGroups = driver.findElements(By.name("ageGroup"));

        for (int i = 0; i < sexButtons.size();i++){
            for(int j = 0; j < ageGroups.size(); j++){
                Assert.assertTrue(driver.findElement(By.className("groupradiobutton")).getText().contains(sexButtons.get(i).getText()));
                Assert.assertTrue(driver.findElement(By.className("groupradiobutton")).getText().contains(ageGroups.get(j).getText()));
            }
        }
    }

    @After
    public void after(){
        super.after();
    }
}
