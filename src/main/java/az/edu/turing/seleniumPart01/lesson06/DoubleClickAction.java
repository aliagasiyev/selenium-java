package az.edu.turing.seleniumPart01.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DoubleClickAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
        driver.manage().window().maximize();


        // WARNINGGGGG
        // Burada elementimiz basqa bir frame icinde olduguna gore biz bir basa xPath ile yaza bilmirik bunun ucun ise
        driver.switchTo().frame("iframeResult"); // if Id expected we can directly access

        WebElement box1 = driver.findElement(By.xpath("//input[@id='field1']"));
        WebElement box2 = driver.findElement(By.xpath("//input[@id='field2']"));
        WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']\n"));
        box1.clear();
        box1.sendKeys("test");

        Actions actions = new Actions(driver);
        actions.doubleClick(button).perform();


        // we can not call this text because getText() can only capture inner text
        // String text = box2.getText();

        String text= box2.getAttribute("value");
        System.out.println(text);




//input[@id='field1']
//input[@id='field2']
//button[normalize-space()='Copy Text']
    }
}
