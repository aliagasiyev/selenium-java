package az.edu.turing.seleniumPart01.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BootstrapDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();

        // Select single option
        driver.findElement(By.xpath("//span[@class='multiselect-selected-text']")).click(); //open drowdown options
        driver.findElement(By.xpath("//label[normalize-space()='Java']")).click();




    }
}
