package TestNg.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationsDemo2 {

    WebDriver driver;
    @BeforeMethod
    void login() {
        driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
    }
    @Test(priority = 1)
    void search() {
       WebElement webelement= driver.findElement(By.xpath("//input[@id='name']"));
       webelement.click();
    }
    @Test(priority = 2)
    void advancedSearch() {
        WebElement webElement= driver.findElement(By.xpath("//input[@id='name']"));
        webElement.sendKeys("Hello My Name is Ali");
        WebElement webElement2= driver.findElement(By.xpath("//input[@id='email']"));
        webElement2.sendKeys("abbbbaaa3222");
        WebElement webElement3= driver.findElement(By.xpath("//input[@id='phone']"));
        webElement3.sendKeys("000-00-00-00");
        WebElement webElement4= driver.findElement(By.xpath("//input[@id='male']"));
        webElement4.click();
        WebElement webElement5= driver.findElement(By.xpath("//input[@id='sunday']"));
        webElement5.click();


    }
    @AfterMethod
    void logout() throws InterruptedException {
        driver.close();
        //driver.quit();
    }
}
