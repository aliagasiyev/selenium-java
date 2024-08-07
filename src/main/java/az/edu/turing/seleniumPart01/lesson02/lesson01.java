package az.edu.turing.seleniumPart01.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson01 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://turbo.az/");
        driver.findElement(By.name("q[price_from]")).sendKeys("15000");
        driver.findElement(By.name("q[price_to]")).sendKeys("25000");
        driver.findElement(By.cssSelector("button[name=commit]")).click();
        driver.findElement(By.cssSelector("span[class=page]")).click();






    }
}
