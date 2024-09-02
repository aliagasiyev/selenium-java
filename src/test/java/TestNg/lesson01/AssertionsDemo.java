package TestNg.lesson01;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDemo {

    @Test
    void testTitle(){
        String expected_title="OpenCart";
        String act_title="Open Shop";
        Assert.assertEquals(expected_title,act_title);

    }
}
