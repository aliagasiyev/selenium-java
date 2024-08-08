package az.edu.turing.seleniumPart01.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Frames {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://ui.vision/demo/webtest/frames/");
        driver.manage().window().maximize();

        // Frame 1 əəvləcə frame özünə bir  başa keçirik sonra
        WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
        driver.switchTo().frame(frame1); // passes frame as webelement // switch to frame 1
        driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Hello World");
    }
}
