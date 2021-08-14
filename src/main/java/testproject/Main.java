package testproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import testproject.subprojecttest.testExercise2;
import testproject.subprojecttest.testExercise3;

import java.awt.*;

public class Main {
    protected static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) throws InterruptedException, AWTException {

//        testExercise1 test1 = new testExercise1();
//        test1.simpleFormDemoTest(driver);
//        testExercise2 test2 = new testExercise2();
//        test2.singleInputFieldTest(driver);
        testExercise3 test3 = new testExercise3();
        test3.doubleInputFieldTest(driver);


    }
}
