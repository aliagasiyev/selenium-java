package az.edu.turing.seleniumPart01.lesson04;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupHandle {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        //Syntax
        //http://username:password@the-internet.herokuapp.com/basic_auth
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");


    }
}
