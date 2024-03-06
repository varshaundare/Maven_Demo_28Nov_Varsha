package testNG.Priority;

import org.testng.annotations.Test;

public class PriorityExample {                                                             //we declare priority with annotation, testNg sequence follow same as hat work these priority applicable on @test annotation
    @Test(priority = 1)                                                                     //by default prioriy start from 0 the follow sequence if we add it rather than o then like here 1
    public void testScriptA(){                                                              //we can't declare priority in decimal value or float no it will give compile time error
        System.out.println("Test Script A");
    }
    @Test(priority = 2)
    public void testScriptF(){
        System.out.println("Test Script F");
    }
    @Test(priority = 0)
    public void testScriptD(){
        System.out.println("Test Script D");
    }
    @Test
    public void testScriptC(){
        System.out.println("Test Script C");
    }
    @Test(priority = 'a')                                                                   //we can add char as priority it take hex value of that charchtor
    public void testScriptE(){
        System.out.println("Test Script E");
    }
    @Test(priority = -5)                                                                  // we can add -ve value as priority it will work as per value
    public void testScriptB(){                                                            //If priority not mention it follow alphabetically
        System.out.println("Test Script B");
    }
}

