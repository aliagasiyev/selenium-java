package TestNg.lesson04;

import org.testng.annotations.Test;

/*
loginByFaceboook -sanity
loginByEmail -sanity
loginByTwitter -sanity
 we group all test
 */
public class LoginTests {

    @Test(priority = 1,groups = {"sanity"})
    void loginByEmail() {
        System.out.println("This is login by email..");
    }

    @Test(priority = 2,groups = {"sanity"})
    void loginByFacebook() {
        System.out.println("This is login by facebook..");
    }

    @Test(priority = 3,groups = {"sanity"})
    void loginBytwitter() {
        System.out.println("This is login by twitter..");
    }
}
