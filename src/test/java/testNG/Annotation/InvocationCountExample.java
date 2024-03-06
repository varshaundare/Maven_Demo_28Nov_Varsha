package testNG.Annotation;

import org.testng.annotations.Test;

public class InvocationCountExample {
    @Test(invocationCount = 10, invocationTimeOut = 5)                                                            //if you want one method to run multiple time then these annotation is use, we can provide time also to complete execute if it not complete in given time frame it will give error or exception
    public void iCountExample(){
        System.out.println("I Count Method");
    }
}
