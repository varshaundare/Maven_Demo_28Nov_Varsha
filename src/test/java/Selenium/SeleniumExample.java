package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class SeleniumExample {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampat\\Desktop\\N\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();

        driver.close();
    }
}
