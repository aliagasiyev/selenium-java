package az.edu.turing.seleniumPart01.TestinHeadless;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class RunTestIncognitoMode {
    public static void main(String[] args) {
        // Bu onun ucundur ki chrome elave elediyimiz elave pluginlerin gorunmesi ucundur
        // meselen selector hub

        // ChromeOptions nesnesi oluşturun
        ChromeOptions chromeOptions = new ChromeOptions();

        File file = new File("C:\\Users\\ASUS\\Downloads\\SelectorsHub.crx");
        chromeOptions.addExtensions(file);

        WebDriver driver = new ChromeDriver(chromeOptions);

        driver.get("https://text-compare.com/");

    }
}
