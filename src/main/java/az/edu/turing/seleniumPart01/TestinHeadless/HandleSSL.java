package az.edu.turing.seleniumPart01.TestinHeadless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleSSL {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true); // accepts SSL certificates if

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://expired.badssl.com/");

        System.out.println("Your page title is: " + driver.getTitle());
    }
}
