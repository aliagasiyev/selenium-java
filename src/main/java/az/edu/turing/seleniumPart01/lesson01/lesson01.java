package az.edu.turing.seleniumPart01.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
Test Cae
-----------
1)Launch browser(chrome)
2)Open URL https://demo.opencart.com/
3)Validate title should be "Your Store"
4)close browser
 */
public class lesson01 {
    public static void main(String[] args) {

        //1-Launch browser(chrome)
        WebDriver driver = new ChromeDriver();

        //2-Open URL https:
        driver.get("https://oxu.az/siyaset/zaxarova-ai-nin-ermenistana-10-milyon-avro-deyerinde-herbi-yardim-ayirmasindan-danisdi");

        //3-Validate title should be "Your title name"
        String current_title = driver.getTitle();
        if (current_title.equals("Zaxarova Aİ-nin Ermənistana 10 milyon avro dəyərində hərbi yardım ayırmasından danışdı - Oxu.az")){
            System.out.println("Your Title is PASSED " + current_title);
        }
        else {
            System.out.println("Your Title is FAILED " + current_title);
        }

        //4-close browse
        driver.quit();
        //driver.close();

    }

}
