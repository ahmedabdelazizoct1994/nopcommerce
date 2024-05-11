package tests;

import data.LoadProperties;
import data.utilities.extent_report.ExtentReport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class TestBase {
    public static WebDriver driver;
    public static ExtentReport report;

    @BeforeSuite
    public void startDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
        driver.navigate().to(LoadProperties.userData.getProperty("URL"));

        report = new ExtentReport();
        report.setUp();
    }


    @AfterSuite
    public void stopDriver() {
        driver.quit();


        report.extent.flush();
    }
}
