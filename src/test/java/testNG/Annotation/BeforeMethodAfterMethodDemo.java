package testNG.Annotation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeMethodAfterMethodDemo {
    @BeforeMethod                                                                       //here we write(pre request) comman code which we want to run before every test anotation it run before evry test anotation means (@test)
    public void beforeMethodExample(){
        System.out.println("Before Method 1");
    }
    @Test
    public void testCase1(){
        System.out.println("TestCase 1");
    }
    @Test
    public void testCase2(){
        System.out.println("TestCase 2");
    }
    @AfterMethod
    public void afterMethodExample(){                                                     //here we write(post request) comman code which we want to run after every test anotation(@test) it run before evry test anotation
        System.out.println("After Method 1");
    }
}


