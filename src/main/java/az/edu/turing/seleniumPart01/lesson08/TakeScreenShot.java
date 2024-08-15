package az.edu.turing.seleniumPart01.lesson08;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class TakeScreenShot {
    public static void main(String[] args) {
        //full page
        // specific area of the page
        // web element

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        // 1) full page screenshot
//        TakesScreenshot ts = (TakesScreenshot) driver;
//        File myfile=ts.getScreenshotAs(OutputType.FILE);
//        File target=new File(System.getProperty("user.dir")+"\\resourcee\\fullpage.png");
//        myfile.renameTo(target);

        //2) specific area of page() ve screen

       WebElement webElement= driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
       File myfile= webElement.getScreenshotAs(OutputType.FILE);
       File target=new File(System.getProperty("user.dir")+"\\resourcee\\fullpage.png");
       myfile.renameTo(target);


    }
}
