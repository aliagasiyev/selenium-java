package az.edu.turing.seleniumPart03.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LogingPage2 {
    WebDriver driver;

    public LogingPage2(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    // Locators
//    By username_loc=By.xpath("//input[@placeholder='Username']");
//    By password_loc=By.xpath("//input[@placeholder='Password']");
//    By login_loc=By.xpath("//button[normalize-space()='Login']");
//
    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement username;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement password;

    @FindBy(xpath = "//button[normalize-space()='Login']")
    public WebElement login;

    // locate all links
    @FindBy(tagName = "a")
    List<WebElement> links;


   //Actinon methods
    public void setUsername(String user) {
        username.sendKeys("Admin");
   }
    public void setPassword(String password1) {
        password.sendKeys("admin123");
    }
    public void clickLogin(){
       login.click();
    }
}
