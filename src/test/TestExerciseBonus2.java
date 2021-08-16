import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import testbase.TestBase;

import java.time.format.TextStyle;
import java.util.Locale;

public class TestExerciseBonus2 extends TestBase {

    @Before
    public void setup(){
        super.setup();
        driver.findElement(By.linkText("Table")).click();
        driver.findElement(By.linkText("Table Sort & Search")).click();
    }

    @Test
    public void testSortAndSearchTable(){
//        Select selectTest = new Select(driver.findElement(By.name("example_length")));
//        selectTest.selectByValue("25");
//        WebElement ageOrderButton = driver.findElement(By.)
    }

    @After
    public void after(){
        super.after();
    }
}
