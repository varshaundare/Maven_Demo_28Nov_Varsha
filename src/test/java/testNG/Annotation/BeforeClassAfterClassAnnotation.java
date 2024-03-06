package testNG.Annotation;

import org.testng.annotations.*;

public class BeforeClassAfterClassAnnotation {
    @BeforeClass                                                                            ////here we write(pre request) comman code which we want to run before method test anotation it run before methos and test anotation means (@test)
    public void beforeClassExample(){
            System.out.println("Before Class 1");
        }
    @BeforeMethod                                                                            //here we write(pre request) comman code which we want to run before every test anotation it run before evry test anotation means (@test)
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
    @AfterClass
    public void afterClassExample(){                                                     //here we write(post request) comman code which we want to run after every test anotation(@test) it run before evry test anotation
        System.out.println("After Class 1");
    }
}
