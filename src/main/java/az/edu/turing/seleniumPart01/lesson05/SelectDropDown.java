package az.edu.turing.seleniumPart01.lesson05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class SelectDropDown {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        WebElement webElement = driver.findElement(By.xpath("//select[@id='country']"));
        Select select = new Select(webElement);
        //select.selectByIndex(1); // call elements their index
        // select.selectByVisibleText("United States"); // call elements their value example Canada France\
        //select.selectByValue("uk"); // example france,us,uk can give us

        // Size of elements
        List<WebElement> elements = select.getOptions();
        System.out.println("Size of elements is here:"+elements.size());

        // if I want to print element here
        for (WebElement element : elements) {
            System.out.println(element.getText()); // we must declare elemnet.getText() because we must convert to text
       }
//        for(int i=0;i<elements.size();i++){
//            System.out.println(elements.get(i).getText());
//        }
    }
}
