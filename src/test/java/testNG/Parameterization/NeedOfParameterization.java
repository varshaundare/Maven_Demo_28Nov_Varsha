package testNG.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParameterization {
    @Test
    public void verifyGoogleSearch() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampat\\Desktop\\N\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement googleSearchTextBox = driver.findElement(By.name("q"));
        googleSearchTextBox.sendKeys("Selenium " + "Pune");                    //if you want to add more hard code data to enter or search , we never hard code our test data in our test cases , we pass value at run time y using parameter
        googleSearchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
