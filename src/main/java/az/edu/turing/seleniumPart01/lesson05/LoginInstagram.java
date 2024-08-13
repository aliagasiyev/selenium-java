package az.edu.turing.seleniumPart01.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginInstagram {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.instagram.com/");

        WebElement webElement = driver.findElement(By.xpath("//input[@name='username']"));
        webElement.sendKeys("agasiyev.ali");

        WebElement webElement2 = driver.findElement(By.xpath("//input[@name='password']"));
        webElement2.sendKeys("1111111111");


        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit' and contains(., 'Log in')]"));
        loginButton.click();



    }
}
