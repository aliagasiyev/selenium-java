package az.edu.turing.seleniumPart01.lesson01;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

// Navigate to the website
// Case 1: Using `By.name` to interact with elements (commented out in the code)
// Case 2: Using `By.id` to check if an element is displayed
// Case 3: Using `By.linkText` and `By.partialLinkText` to interact with links
// Case 4: Using `By.className` to find elements by class name
// Case 5: Using `By.tagName` to find and count elements by tag name

public class lesson02 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://turbo.az/");
        driver.manage().window().maximize();// open window max size

        /// name
        driver.findElement(By.name("q[price_from]")).sendKeys("5000");
        driver.findElement(By.name("q[price_to]")).sendKeys("75000");

        //id
         boolean logoDisplaystatus = driver.findElement(By.id("dom_overlay_container ")).isDisplayed();
        System.out.println(logoDisplaystatus);

        //linketext & partialLinkText
        driver.findElement(By.linkText("Salonlar")).click();
         driver.findElement(By.linkText("Moto")).click();
        driver.findElement(By.partialLinkText("elanlar")).click();// we dont prefer

        // we use class atribute and capture multiple web elemenet
        // if we want to use one element to find Web element we use (driver.findElement)
        //if we want to use multiple element to find Web element we use(driver.findElements)
        // returun List we use List because we save multiple web element

         //tagname
        List<WebElement> drive = driver.findElements(By.className("header-bar--left"));
        System.out.println(drive.size());

        List<WebElement> drivers =driver.findElements(By.tagName("img"));
        System.out.println(drivers.size());

    }
}
