package TestNg.lesson03;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestC {

    @Test
    void pqr() {
        System.out.println("this is pqr from C3");
    }

    @BeforeSuite
    void bs() {
        System.out.println("Before Suite");
    }

    @AfterSuite
    void as() {
        System.out.println("After Suite");
    }

}
