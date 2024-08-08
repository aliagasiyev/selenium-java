package az.edu.turing.seleniumPart01.lesson03;

import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.time.Duration;
import java.util.NoSuchElementException;

public class FluentWaitDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        Wait<WebDriver> wait = new FluentWait<>(driver).
                withTimeout(Duration.ofSeconds(40)).
                pollingEvery(Duration.ofSeconds(5)).
                ignoring(NoSuchElementException.class);

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

            WebElement txt = wait.until((Function<WebDriver, WebElement>) driver1 -> {
                return driver1.findElement(By.xpath("//input[@placeholder='Username']"));// this is element we are looking for;
            });
            txt.sendKeys("Admin");
    }

}
