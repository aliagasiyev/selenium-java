package TestNg.lesson07;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

    public void onStart(ITestContext context) {
        System.out.println("On Start");
    }

    public void onTestStart(ITestResult result) {

        System.out.println("On TestStart");
    }

    public void onTestFailure(ITestResult result) {

        System.out.println("On TestFailure");
    }

    public void onTestSkipped(ITestResult result) {

        System.out.println("On TestSkipped");
    }

    public void onFinish(ITestContext context) {
        System.out.println("On Finish");
    }


}
