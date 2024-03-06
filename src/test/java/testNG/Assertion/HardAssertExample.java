package testNG.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {
    @Test
    public void hardAssert(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampat\\Desktop\\N\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        WebElement loginTextBox = driver.findElement(By.id("login1"));
        Assert.assertEquals(title,"Rediffmail","Title should be matched");  //in assets we can add comparison which you want exactly in excepted result it if match then only it run ferthur otherwise terminate prog
        Assert.assertTrue(loginTextBox.isDisplayed(),"Login Text Box should be dislay");  //we can use hard assets many time in single prog but we mostly not use it
        driver.close();
    }
}
