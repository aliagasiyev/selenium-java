package az.edu.turing.seleniumPart01.lesson06;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.time.Duration;

public class MouseHoverAction {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://turbo.az/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement desktops = driver.findElement(By.xpath("//a[contains(text(),'Ehtiyat hissələr və aksesuarlar')]"));

        WebElement desktop = driver.findElement(By.xpath("//a[normalize-space()='Aksesuarlar']"));

        Actions action = new Actions(driver);
        action.moveToElement(desktops).moveToElement(desktop).build().perform();
        desktop.click();

    }
}
