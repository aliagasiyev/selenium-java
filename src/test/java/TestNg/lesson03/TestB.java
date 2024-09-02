package TestNg.lesson03;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class TestB {

    @Test
    void cde(){
        System.out.println("this is xyz from C2");
    }
    @AfterTest
    void vcd(){
        System.out.println("this is AfterTest method");
    }
}
