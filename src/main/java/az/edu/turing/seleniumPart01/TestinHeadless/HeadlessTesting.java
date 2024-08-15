package az.edu.turing.seleniumPart01.TestinHeadless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class HeadlessTesting {
    public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
       options.addArguments("--headless=new"); // headless mode
       // options.addArguments("incognito");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://demo.opencart.com/");

        String current_title = driver.getTitle();

        if (current_title.equals("Your Store")) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        driver.quit();
    }
}