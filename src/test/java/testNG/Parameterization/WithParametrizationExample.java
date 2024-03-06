package testNG.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class WithParametrizationExample {
    public WebDriver driver;
    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethodTestDemo(String browserName){
        if (browserName.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampat\\Desktop\\N\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            FirefoxOptions firefoxOptions = new FirefoxOptions();                       //For FF we need to set path where our FF is save in program file
            firefoxOptions.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");

            System.setProperty("webdriver.gecko.driver","C:\\Users\\Sampat\\Desktop\\N\\geckodriver.exe");
            driver = new FirefoxDriver(firefoxOptions);
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver","C:\\Users\\Sampat\\Desktop\\N\\msedgedriver.exe");
            driver = new EdgeDriver();
        }else {
            throw new RuntimeException("Please select correct browser");
        }
    }
    @Parameters({"courseName", "cityName" })                                              //here we declare data which need for test validation or as an input
    @Test
    public void verifyGoogleSearch(String courseName, String cityName) throws InterruptedException {
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
