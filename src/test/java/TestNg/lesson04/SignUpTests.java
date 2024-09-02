package TestNg.lesson04;

import org.testng.annotations.Test;

public class SignUpTests {

    /*
loginByFaceboook -regression
loginByTwitter -regression
loginByemail -regression
 */


    @Test(priority = 1,groups = "regression")
    void signByEmail() {
        System.out.println("This is login by email..");
    }

    @Test(priority = 2,groups = "regression")
    void signByFacebook() {
        System.out.println("This is login by facebook..");
    }

    @Test(priority = 3,groups = "regression")
    void signBytwitter() {
        System.out.println("This is login by twitter..");
    }
}
