package az.edu.turing.seleniumPart01.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingDown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor)driver;

//        1) scrool down by pixel numer
//        js.executeScript("window.scrollBy(0,2440)");
//        System.out.println(js.executeScript("return window.pageYOffset"));

        //2) scrool the page till element is visible hara qeder asagi dusmeyimizi gosterir
          WebElement webElement= driver.findElement(By.xpath("//a[normalize-space()='Home']"));
//       js.executeScript("arguments[0].scrollIntoView();",webElement);

       //3) scrooling up to itial position
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return document.body.scrollHeight"));
        Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");


    }
}
