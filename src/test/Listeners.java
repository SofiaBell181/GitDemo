package test;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) {
    	
    }

    @Override
    public void onTestSuccess(ITestResult result) { 
    	System.out.println("Passed");
   
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	// screenshot code
    	System.out.println("This " + result.getName()+ " case is failed");

    }

    @Override
    public void onTestSkipped(ITestResult result) { 
    	
    }
}
