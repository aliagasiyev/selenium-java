package TestNg.lesson06;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtendReportManager implements ITestListener {

    public ExtentSparkReporter sparkReporter; // UI of the report
    public ExtentReports extent; // populate common info on the report
    public ExtentTest test; // creating test case entries in the report and update status of the test methods

    public void onStart(ITestContext context) {
        // We configure UI here
        sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReport.html"); // 1-ci noqsan burada bir movzunu qaciririq oda budurki biz her defe kodu run edende
        // yeni report yaranir meselen men dunenki reportuma baxmaq istesem ona baxa bilmirem cunki her defe run edende ozu yaranir
        sparkReporter.config().setDocumentTitle("Automation Report"); // title of report
        sparkReporter.config().setReportName("Functional Testing"); // name of the report
        sparkReporter.config().setTheme(Theme.DARK);

        extent = new ExtentReports();
        extent.attachReporter(sparkReporter); // we connect each other

        // 2-ci noqsan biz burada bunlari yazmamaliyiq ozleri default olaraq yazilmalidi
        extent.setSystemInfo("Computer", "localhost");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester Name", "AliSabili");
        extent.setSystemInfo("os", "Windows11");
        extent.setSystemInfo("Browser name", "chrome");
    }

    public void onTestSuccess(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.PASS, "Test Passed" + result.getName());
    }

    public void onTestFailure(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.FAIL, "Test Failed" + result.getName());
        test.log(Status.FAIL, "Test Failed" + result.getThrowable().getMessage());
    }

    public void onTestSkipped(ITestResult result) {
        test = extent.createTest(result.getName());
        test.log(Status.SKIP, "Test Skipped" + result.getName());

    }
    public void onFinish(ITestContext context) {
        extent.flush();
    }
}
