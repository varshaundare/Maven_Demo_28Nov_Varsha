package testNG.Annotation;

import org.testng.Assert;
import org.testng.annotations.Test;
import testNG.RetryAnalysis.IRetryAnalyserExample;

public class DependsOnMethodExample {
    @Test //(retryAnalyzer = IRetryAnalyserExample.class)                                    //here we have to call thal analizer class prog which made for fail test cases
    public void verifyLogin(){
        Assert.assertTrue(false);                                                 // we use thses so our test case is going to fail now so its dependant method also get skip
        System.out.println("Verify Login");
    }
    @Test//(retryAnalyzer = IRetryAnalyserExample.class)                                  //declare it infron of every class
    public void verifyLogin2(){
        Assert.assertTrue(true);                                                 // we use thses so our test case is going to fail now so its dependant method also get skip
        System.out.println("Verify Login");
    }

    @Test(dependsOnMethods = {"verifyLogin"})                      //check if we can write it here or not sure about it                                 //if you want to run these method after specific method only then we can add dependancy like these with that method name on which our currunt method is depends, if that method is pass then only these method is run oterwise it will get skip
    public void verifyHomePage(){                                                          //we mostly not use these dependcy method and dependancy group becase if we want to run method parally it will not work here as it work once dependant method pass
        System.out.println("Verify Home Page");
    }

    @Test//(retryAnalyzer = IRetryAnalyserExample.class)
    public void verifyFundsTransfer(){
        System.out.println("Verify Funds Transfer");
    }

    @Test//(retryAnalyzer = IRetryAnalyserExample.class)                       //IAnnotationTransformation class once we add this we not need to mention
    public void verifyMyCashBackOffer(){
        System.out.println("Verify My CashBack Offer");
    }
}
