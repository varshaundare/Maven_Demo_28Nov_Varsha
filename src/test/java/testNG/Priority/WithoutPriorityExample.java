package testNG.Priority;

import org.testng.annotations.Test;

public class WithoutPriorityExample {                                                     //Without priority test run alphabetically
    @Test
    public void testScriptA(){
        System.out.println("Test Script A");
    }
    @Test
    public void testScriptF(){
        System.out.println("Test Script F");
    }
    @Test
    public void testScriptD(){
        System.out.println("Test Script D");
    }
    @Test
    public void testScriptC(){
        System.out.println("Test Script C");
    }
    @Test
    public void testScriptE(){
        System.out.println("Test Script E");
    }
    @Test
    public void testScriptB(){
        System.out.println("Test Script B");
    }
}
