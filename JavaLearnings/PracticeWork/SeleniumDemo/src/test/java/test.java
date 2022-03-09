import static org.testng.Assert.assertEquals;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class test {
	 WebDriver driver;
	 ExtentReports extent;
	 ExtentTest logger;
	 ExtentHtmlReporter htmlReporter;
	 String htmlReportPath = "C:\\Users\\heman\\Desktop\\MyOwnReport.html"; //Path for the HTML report to
	 @BeforeTest
	 public void setup(){
	 htmlReporter = new ExtentHtmlReporter(htmlReportPath);
	 extent = new ExtentReports();
	 extent.attachReporter(htmlReporter);
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe");
	 driver = new ChromeDriver();
	 }
	 @Test
	 public void test1(){
	 driver.get("http://www.google.com/");
	 logger.log(Status.INFO, "Opened site google.com");
	 assertEquals(driver.getTitle(), "Google");
	 logger.log(Status.PASS, "Google site loaded");
	 }
	 @AfterMethod
	 public void getResult(ITestResult result) throws Exception {
	 if (result.getStatus() == ITestResult.FAILURE)
	 {
	 logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " Test case FAILED due to below issues:", ExtentColor.RED));
	 logger.fail(result.getThrowable());
	 }
	 else if (result.getStatus() == ITestResult.SUCCESS)
	 {
	 logger.log(Status.PASS, MarkupHelper.createLabel(result.getName() + " Test Case PASSED", ExtentColor.GREEN));
	 }
	 else if (result.getStatus() == ITestResult.SKIP)
	 {
	 logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " Test Case SKIPPED", ExtentColor.BLUE));
	 }
	 }
	 @AfterTest
	 public void testend() throws Exception {
	 extent.flush();
	 }
	 @AfterClass
	 public void tearDown() throws Exception {
	 driver.close();
	 }}