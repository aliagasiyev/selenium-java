package TestNg.lesson01;

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
     void opener() {
        System.out.println("opening application");
    }

    @Test(priority = 2)
     void login() {
        System.out.println("Login to application");
    }

    @Test(priority = 3)
     void logout() {
        System.out.println("You logged out from application");
    }
}
