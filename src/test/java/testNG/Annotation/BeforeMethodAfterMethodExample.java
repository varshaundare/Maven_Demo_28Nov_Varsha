package testNG.Annotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethodExample {
    public WebDriver driver;
   @BeforeMethod                                                                          //here we write(pre request) comman code which we want to run before every test anotation it run before evry test anotation means (@test)
   public void beforeMethodExample(){
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampat\\Desktop\\N\\chromedriver-win64\\chromedriver.exe");
       driver = new ChromeDriver();
   }
    @Test
    public void testCase1(){
        driver.navigate().to("https://www.facebook.com/");
    }
    @Test
    public void testCase2(){
        driver.navigate().to("https://www.google.co.in/");
    }
    @AfterMethod
    public void afterMethodExample(){                                                     //here we write(post request) comman code which we want to run after every test anotation(@test) it run before evry test anotation
        driver.manage().window().maximize();
        driver.close();
    }
}
