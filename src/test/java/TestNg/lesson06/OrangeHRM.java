package TestNg.lesson06;

import TestNg.lesson01.AssertionsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

@Listeners(TestNg.lesson06.MyListener.class)
public class OrangeHRM {

    WebDriver driver;
    @BeforeClass()
    void opener() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
    }


    @Test(priority = 1)
    void testingLogo() {
        boolean isDisplayed = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        Assert.assertTrue(isDisplayed);
    }

    @Test(priority = 2)
    void testAppUrl() {
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @Test(priority = 3,dependsOnMethods ={"testAppUrl"})
    void testHomePageTitle() {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }

    @AfterClass()
    void close() {
        driver.quit();


    }

}
