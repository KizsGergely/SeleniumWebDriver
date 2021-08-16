import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import testbase.TestBase;

import java.util.concurrent.TimeUnit;


public class TestExercise1 extends TestBase {

    @Before
    public void setup(){
        super.setup();
    }

    @Test
    public void testSimpleFormDemo(){

//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_ESCAPE);
        WebElement basicFormsButton = driver.findElement(By.linkText("Input Forms"));
        basicFormsButton.click();
        WebElement inputFormsButton = driver.findElement(By.linkText("Simple Form Demo"));
        inputFormsButton.click();
    }

    @After
    public void after(){
        super.after();
    }
}
