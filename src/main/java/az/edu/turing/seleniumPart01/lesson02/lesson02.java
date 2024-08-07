package az.edu.turing.seleniumPart01.lesson02;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson02 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        //Xpath single attribute
        //driver.findElement(By.xpath("//input[@id='small-searchterms']")).getText();


        driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Tshirts");



    }
}
