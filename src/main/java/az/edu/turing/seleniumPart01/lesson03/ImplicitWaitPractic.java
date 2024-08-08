package az.edu.turing.seleniumPart01.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWaitPractic {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//declare one time
        driver.get("https://turbo.az/");

    WebElement element1= driver.findElement(By.xpath("//input[@name='q[price_from]']"));
    element1.sendKeys("50000");

    WebElement element2= driver.findElement(By.xpath("//input[@name='q[price_to]']"));
    element2.sendKeys("75000");

    WebElement element3= driver.findElement(By.xpath("//button[contains(text(),'Elanları göstər')]"));
    element3.click();

    // close
    driver.close();
    }
}
