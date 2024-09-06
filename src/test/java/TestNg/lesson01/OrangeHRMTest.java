package TestNg.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

// open application
// test logo presence
// login
// close
public class OrangeHRMTest {
    WebDriver webDriver;

    @Test(priority = 1)
    void opener() {
        webDriver = new ChromeDriver();
        webDriver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        webDriver.manage().window().maximize();
        System.out.println("You are logged in successfully ");
    }


    @Test(priority = 2)
    void testingLogo() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        boolean isDisplayed = webDriver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
        System.out.println("Element is displayed " + isDisplayed);
    }

    @Test(priority = 3)
    void login() {
        webDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        webDriver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        webDriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        webDriver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
    }

    @Test(priority = 4)
    void close() throws InterruptedException {
        Thread.sleep(3000);
        webDriver.close();


    }

}
