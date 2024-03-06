package testNG.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
    @Test
    public void softAssertDemo(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampat\\Desktop\\N\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        SoftAssert softAssert=new SoftAssert();                                        //For soft assert compulsary we have to create object of soft assert class
        WebElement loginTextBox = driver.findElement(By.id("login1"));
        softAssert.assertEquals(title,"rediffmail","Title should be matched");  //in soft assets we can add comparison which you want exactly in excepted result it if match or not match(testcase fail) then also it run ferthur
        softAssert.assertTrue(loginTextBox.isDisplayed(),"Login Text Box should be dislay");  //we can use hard assets many time in single prog but we mostly not use it
        System.out.println("Hello");
        softAssert.assertAll();                                                       //if we not use this then it will show fail test case also pass
        driver.close();
    }
}
