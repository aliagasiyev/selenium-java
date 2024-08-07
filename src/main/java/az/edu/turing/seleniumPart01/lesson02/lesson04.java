package az.edu.turing.seleniumPart01.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson04 {
    public static void main(String[] args) {

        // conditional methods

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/register");

        // we must cupture this web element
       // WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
       // System.out.println("Display status of logo:"+logo.isDisplayed());

        //boolean logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
        //System.out.println("Your logo displayed:"+logo);

        //isSelected
        // Before selected
        System.out.println("Before selected elements");
      WebElement webElement=driver.findElement(By.xpath("//input[@id='gender-male']"));
      System.out.println(webElement.isSelected());
      WebElement webElement1=driver.findElement(By.xpath("//input[@id='gender-male']"));
      System.out.println(webElement1.isSelected());

      //After I selected to male or female not different
        System.out.println("After selected element not diffrent");
        webElement.click();// here I select male and here is must displayed true
        webElement1.click();
        System.out.println(webElement.isSelected());
        System.out.println(webElement1.isSelected());


    }
}
