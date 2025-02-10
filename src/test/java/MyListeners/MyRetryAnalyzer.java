package MyListeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer {

    int retryCount =0;
    int maxRetryCount =3;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retryCount<maxRetryCount){
            retryCount++;
            return true; //retry the test
        }
        return false; //stop retrying
    }
}
