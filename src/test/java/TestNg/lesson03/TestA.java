package TestNg.lesson03;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.TestRunner.PriorityWeight.priority;

public class TestA {

    @Test(priority = 1)
    void abc() {
        System.out.println("this is abc from C1");
    }
    @BeforeTest
    void bt(){
        System.out.println("This is before test method");
    }

}
