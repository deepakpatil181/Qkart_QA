package QKART_TESTNG;
import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.ITestListener;

public class ListenerClass implements ITestListener {
    @Override
    public void onTestStart(ITestResult result) 
    {
             QKART_Tests.takeScreenshot (QKART_Tests.driver,  "Test Start", result.getName());
            System.out.println("New Test Started " + result.getName());

    }

@Override
public void onTestSuccess(ITestResult result) {

QKART_Tests.takeScreenshot (QKART_Tests.driver,  "Test Start", result.getName()); 
System.out.println("Test Successfully Finished "+ result.getName());
}

@Override
public void onTestFailure(ITestResult result) {

QKART_Tests.takeScreenshot (QKART_Tests.driver,"Test Start", result.getName()); 
System.out.println("Test Failed " + result.getName());
}

@Override
public void onStart(ITestContext result) {

QKART_Tests.takeScreenshot (QKART_Tests.driver, "Test Start", result.getName()); 
System.out.println("This is onStart method " + result.getOutputDirectory());
}

}