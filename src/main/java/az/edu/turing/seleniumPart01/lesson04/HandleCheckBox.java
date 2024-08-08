package az.edu.turing.seleniumPart01.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckBox {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://testautomationpractice.blogspot.com/");

        // 1-) select one specific checkbox
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//        WebElement webElement1 = driver.findElement(By.xpath("//input[@id='male']"));
//        webElement1.click();

        //2) select all the checkbox
        // Most of the times xPath did not give as multiple urls

        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input [@class= 'form-check-input' and @type='checkbox']"));

//        for (int i=0; i<checkBoxes.size(); i++) {
//            checkBoxes.get(i).click();
//        }
//
//        for (WebElement checkBox : checkBoxes) {
//            checkBox.click();
//        }

        // 3) select last 3 checkboxes
        // total no of checkbox -how many checkboxes want to select =starting index
        // 7-3=4; index must start 4
        for (int i = 4; i < checkBoxes.size(); i++) {
            checkBoxes.get(i).click();
        }





    }
}
