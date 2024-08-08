package az.edu.turing.seleniumPart01.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Practic {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        // 1.Insert UserName and Password

        WebElement web1= driver.findElement(By.xpath("//input[@id='user-name']"));
        web1.sendKeys("standard_user");

        WebElement web2= driver.findElement(By.xpath("//input[@id='password']"));
        web2.sendKeys("secret_sauce");

        // 2.click to login button
        WebElement web3= driver.findElement(By.xpath("//input[@id='login-button']"));
        web3.click();


        //3.waiting to loading webpage and give us title name
        wait.until(ExpectedConditions.titleIs("Swag Labs"));

        // Clickable element

        wait.until(ExpectedConditions.elementToBeClickable(By.id("//button[@id='add-to-cart-sauce-labs-backpack']")));


        driver.close();
    }




}
