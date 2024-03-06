package testNG.Annotation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {
    @Test(groups = {"smoke"})                                                          //here we defind group
    public void verifyLogin(){
        Assert.assertTrue(false);                                                 // we use thses so our test case is going to fail now so its dependant method also get skip
        System.out.println("Verify Login");
    }
    @Test(enabled = false)                                                                  //if you want to skip method , it not show in block .its run option is also not show there
    public void verifyCashBackOffer(){
        System.out.println("Verify CashBack Offer");
    }
    @Test(dependsOnGroups = {"smoke"} , alwaysRun = true)                                   //if we use always run = true then if group is fail then also our test case get execute , if our parent method is fail anc you want to run child method any how then we have to use this alwaysRun= true                                             //if you want to run these method after specific method only then we can add dependancy like these with that method name on which our currunt method is depends, if that method is pass then only these method is run oterwise it will get skip
    public void verifyHomePage(){                                                          //we mostly not use these dependcy method and dependancy group becase if we want to run method parally it will not work here as it work once dependant method pass
        System.out.println("Verify Home Page");
    }
    @Test
    public void verifyFundsTransfer(){
        System.out.println("Verify Funds Transfer");
    }
}
