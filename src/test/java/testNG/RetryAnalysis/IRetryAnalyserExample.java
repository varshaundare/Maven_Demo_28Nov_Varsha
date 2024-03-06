package testNG.RetryAnalysis;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class IRetryAnalyserExample implements IRetryAnalyzer {

    private int retryCount = 0;
    private static final int maxRetryCount =3;

    @Override
    public boolean retry(ITestResult iTestResult) {                                       //this is inbuild in that we modify
        if (retryCount<maxRetryCount){
            retryCount ++;
            return true;
        }
        return false;
    }
}
