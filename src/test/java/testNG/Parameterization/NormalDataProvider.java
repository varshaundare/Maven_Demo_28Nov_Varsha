package testNG.Parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NormalDataProvider {
    @DataProvider(name = "test-data")                                                        //if you want to run same test case with different test data that time we use this @dataprovideed anotation
    public Object[][] testData(){                                                            //it has two dimention array is return type so we can't use void here will get error
        return new Object[][]{                                                               //we never define data like this as its not conviniant we use excel or database
                {"Selenium","Pune"},{"Java","Nashik"},{"Python","Mumbai"}                   //here like this we declare data
        };
    }

    @Test(dataProvider = "test-data")
    public void verifyGoogleSearch(String courseName, String cityName) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Sampat\\Desktop\\N\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.co.in/");
        driver.manage().window().maximize();
        WebElement googleSearchTextBox = driver.findElement(By.name("q"));
        googleSearchTextBox.sendKeys(courseName + cityName);                    //if you want to add more hard code data to enter or search , we never hard code our test data in our test cases , we pass value at run time y using parameter
        googleSearchTextBox.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
        driver.close();
    }
}
