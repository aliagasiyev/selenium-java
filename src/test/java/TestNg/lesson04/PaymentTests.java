package TestNg.lesson04;

import org.testng.annotations.Test;

public class PaymentTests {

    //paymentinrupees-sanity,regression(functional)
    //paymentinrupees-sanity,regression(functional)

    @Test(priority = 1,groups = {"sanity","regression","functional"})
    void paymentRupees(){
        System.out.println("PaymentRupees");
    }
    @Test(priority = 2,groups = {"sanity","regression","functional"})

    void paymentDollars(){
        System.out.println("PaymentDollars");
    }
}
