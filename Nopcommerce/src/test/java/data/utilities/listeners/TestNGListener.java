package data.utilities.listeners;

import com.aventstack.extentreports.Status;
import data.utilities.extent_report.ExtentReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        ExtentReport.test = ExtentReport.extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ExtentReport.test.log(Status.PASS, "Test Case PASSED IS " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ExtentReport.test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getName());
        ExtentReport.test.log(Status.FAIL, "TEST CASE FAILED IS " + result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ExtentReport.test.log(Status.SKIP, "Test Case SKIPPED IS " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentReport.extent.flush();
    }
}
