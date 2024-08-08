package az.edu.turing.seleniumPart01.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileOutputStream;
import java.util.List;

public class CheckBoxTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //all element selected:

//        Thread.sleep(5000);
//        List<WebElement> webElement= driver.findElements(By.xpath("//input [@class= 'form-check-input' and @type='checkbox']"));
////        for (WebElement element : webElement) {
////            element.click();
////        }
//        for (int i=3;i<webElement.size();i++){
//            webElement.get(i).click();
//        }

        // Select other element in our class
        Thread.sleep(2000);
        List<WebElement> checkboxes = driver.findElements(By.xpath("//*[@id=\"productTable\"]/tbody/tr/td[4]/input"));

        for (WebElement checkbox : checkboxes) {
            checkbox.click();
        }
    }
}
