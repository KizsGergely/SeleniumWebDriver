import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testbase.TestBase;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Calendar;
import java.util.Locale;

public class TestExercise5 extends TestBase {

    @Before
    public void setup() {
        super.setup();
        WebElement basicFormsButton = driver.findElement(By.linkText("Input Forms"));
        basicFormsButton.click();
        WebElement inputFormsButton = driver.findElement(By.linkText("Select Dropdown List"));
        inputFormsButton.click();
    }

    @Test
    public void testSelectList(){
        DayOfWeek day = LocalDate.now().getDayOfWeek();
        Select selectTest = new Select(driver.findElement(By.id("select-demo")));
        selectTest.selectByValue(day.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(@class,'selected-value')]")).getText().contains(day.getDisplayName(TextStyle.FULL, Locale.ENGLISH)));
    }

    @After
    public void after(){
        super.after();
    }

}
