package az.edu.turing.seleniumPart01.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Executor {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Salam");

        // Same task javascriptexecutor
        WebElement webElement = driver.findElement(By.xpath("//input[@id='name']"));

        // passing the text into input --alternative of sendKeys()
        JavascriptExecutor js = (JavascriptExecutor) driver; // we can not create object becase this is interface
        js.executeScript("arguments[0].setAttribute('value','John ');", webElement);

        // clicking on element -alternative of click
       WebElement webElement1= driver.findElement(By.xpath("//input[@id='male']"));
       js.executeScript("arguments[0].click();", webElement1);



    }
}
