package az.edu.turing.seleniumPart01.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson05 {

    public static void main(String[] args) throws InterruptedException {

       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
       Thread.sleep(5000);
       driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
       Thread.sleep(5000);
       //driver.close(); //close one browser
        driver.quit();// close multiple browser
    }
}
