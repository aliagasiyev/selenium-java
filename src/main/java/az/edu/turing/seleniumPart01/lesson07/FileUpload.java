package az.edu.turing.seleniumPart01.lesson07;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import javax.naming.BinaryRefAddr;

public class FileUpload {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().window().maximize();

        //single file upload
//        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("\"C:\\Users\\ASUS\\Desktop\\happy.txt\"");
//
//       if (driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("happy.txt")){
//           System.out.println("Successfully uploaded");
//       }
//       else {
//           System.out.println("Failed to upload");
//       }
       // Multiple file upload
        String file1 = "D:\\AppTest.txt";
        String file2 = "D:\\AppTest.txt";
        driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1 + "\n" + file2);

//        SearchContex;
//        WebDriver;
//        RemoteWebDriver


    }

}
