package TestNg.lesson07;

import az.edu.turing.seleniumPart03.lesson01.DashBoradPage;
import az.edu.turing.seleniumPart03.lesson01.LoginPage;
import az.edu.turing.seleniumPart03.lesson01.LogingPage2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class DashBoradTest {
    WebDriver driver;
    @BeforeClass
    void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
    }

    @Test
    void testLogin() {
        LogingPage2 loginPage = new LogingPage2(driver);
        loginPage.setUsername("Admin");
        loginPage.setPassword("admin123");
        loginPage.clickLogin();
    }
    @Test
    void testSave(){
        DashBoradPage dashBoradPage = new DashBoradPage(driver);
        dashBoradPage.clickCreate();
        dashBoradPage.clickAdd();
        dashBoradPage.clickFirstName("Akif");
        dashBoradPage.clickMiddleName("AkifOglu");
        dashBoradPage.clickLastName("AkifOglununAkifi");
        dashBoradPage.clickEmployeeId("123456");
        dashBoradPage.clickButtonClickSave();
    }

    @AfterClass
    void tearDown() {
        driver.quit();
    }
}
