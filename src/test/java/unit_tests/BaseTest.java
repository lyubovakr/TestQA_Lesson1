package unit_tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void beforTest() {
        System.out.println("Before test method was startet");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("After test method was started");
    }
}
