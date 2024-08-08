package az.edu.turing.seleniumPart01.lesson04;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class HandleAlerts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        // 1) Normal alert with Ok button
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
//
//        Thread.sleep(2000);
        // this capture alert and close

        // Alert is interface we can use multiple tasks
        // if we want to do multiple task we must store element with Alert type
        // and when we use to close we use accept
//        Alert myalert = driver.switchTo().alert();
//        System.out.println(myalert.getText());
//        myalert.accept();

        //2) confirmation Alert - OK & Cancel
        // when we use confirm to close with cancel we use dismis
//        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
//        Thread.sleep(5000);
//        driver.switchTo().alert().dismiss();



        //3) click ok button and write something
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello World");
        alert.accept();


    }
}
