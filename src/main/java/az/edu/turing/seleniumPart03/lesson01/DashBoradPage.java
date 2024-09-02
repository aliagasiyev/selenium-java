package az.edu.turing.seleniumPart03.lesson01;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoradPage {
    WebDriver driver;

    // Constructor
    public DashBoradPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Locators
//    By create=By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a");
//    By add=By.xpath("//button[normalize-space()='Add']");
//    By first_name=By.xpath("//input[@placeholder='First Name']");
//    By middle_name=By.xpath("//input[@placeholder='Middle Name']");
//    By last_name=By.xpath("//input[@placeholder='Last Name']");
//    By employee_id=By.xpath("//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']");
//    By button_clickSave=By.xpath("//button[normalize-space()='Save']");

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")
    public WebElement create;

    @FindBy(xpath ="//button[normalize-space()='Add']")
    public WebElement add;

    @FindBy(xpath = "//input[@placeholder='First Name']")
    public WebElement firstName;

    @FindBy(xpath ="//input[@placeholder='Middle Name']")
    public WebElement middleName;

    @FindBy(xpath ="//input[@placeholder='Last Name']" )
    public WebElement lastName;

    @FindBy(xpath = "//div[@class='oxd-input-group oxd-input-field-bottom-space']//div//input[@class='oxd-input oxd-input--active']")
    public WebElement employe_id;

    @FindBy(xpath ="//button[normalize-space()='Save']" )
    public WebElement save;



    // Annotations
    public void clickCreate(){
       create.click();
    }
    public void clickAdd(){
        add.click();
    }
    public void clickFirstName(String username){
       firstName.sendKeys("Samir");
    }
    public void clickMiddleName(String middleName1){
       middleName.sendKeys("AkifOglu");
    }
    public void clickLastName(String lastName1){
        lastName.sendKeys("Samirrrrrrr");
    }
    public void clickEmployeeId(String employeeId1){
        employe_id.sendKeys("2312");
    }
    public void clickButtonClickSave(){
        save.click();
    }

}
