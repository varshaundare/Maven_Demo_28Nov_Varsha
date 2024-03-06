package testNG.Parameterization;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataProviderWithExcel {
    @DataProvider(name = "test-data")
    public Object[][] dataProviderFunction() throws IOException {
        Object[][] arrayObj = getExcelData("C:\\Users\\Sampat\\Desktop\\selenium\\DataProvider.xlsx", "testCase1");   //here we add sheet path with worksheet name(Sheet1 like this)
        return arrayObj;
    }
    public String[][] getExcelData(String fileName, String sheetName) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(fileName);                    // to access file
        XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);                          //this is dedicated class to acces excel file so we have to use to read or operate excel data
        XSSFSheet sheet = workbook.getSheet(sheetName);                                     //to access particular sheet we use this
        XSSFRow row = sheet.getRow(0);                                         // to access row e use this
        int noOfRow = sheet.getPhysicalNumberOfRows();
        int noOfColumn = row.getLastCellNum();                                             //to count no of column
        Cell cell;                                                                           // cell is an iterface provided by apachi
        String[][] data = new String[noOfRow-1][noOfColumn];                                 //rows start with zero so thats why here we added noOfRow-1
        for (int i =1; i<=noOfRow-1 ; i++){                                                   //row ,we start count from 1 as 0 cell is heading not data here   //here we access the data from table
              for (int j=0; j<noOfColumn; j++){                                            //column
                  row = sheet.getRow(i);
                  cell = row.getCell(j);
                  data[i - 1][j]=cell.getStringCellValue();
              }
        }
            return data;

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
