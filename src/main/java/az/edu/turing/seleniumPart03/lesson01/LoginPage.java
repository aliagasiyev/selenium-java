package az.edu.turing.seleniumPart03.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    //This is Our Page object class here and now we must create Test Senarios
    WebDriver driver;

    // 3 main part
    // Constructor
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    By username_loc=By.xpath("//input[@placeholder='Username']");
    By password_loc=By.xpath("//input[@placeholder='Password']");
    By login_loc=By.xpath("//button[normalize-space()='Login']");

    //Actinon methods
    public void setUsername(String username) {
        driver.findElement(username_loc).sendKeys(username);
    }
    public void setPassword(String password) {
        driver.findElement(password_loc).sendKeys(password);
    }
    public void clickLogin(){
        driver.findElement(login_loc).click();
    }


}
