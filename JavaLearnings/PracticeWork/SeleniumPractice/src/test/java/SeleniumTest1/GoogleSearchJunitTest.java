package SeleniumTest1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
//We used webdriver manager in the pom.xml file which will automatically help us setup the driver executable path
/**
 * Start 4 difference browsers by Selenium
 */
public class GoogleSearchJunitTest  {
	@Test
	public void testInIE() throws Exception {
		WebDriverManager.iedriver().setup();
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://testwisely.com/demo");
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void testInFirefox() throws Exception {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testwisely.com/demo");
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void testInChrome() throws Exception {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		driver.manage().window().maximize();
		// Find the text input element by its name
		WebElement element = driver.findElement(By.name("q"));
		assert driver.findElement(By.name("q")).isDisplayed();//Checking whether the element is present or not
		System.out.println("The item is displayed!!!");
		// Enter something to search for
		element.sendKeys("Hello Selenium WebDriver!");
		// Submit the form based on an element in the form
		element.submit();
		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());
		
		driver.quit();
		Thread.sleep(1000);
		driver.quit();
	}
	@Test
	public void testInEdge() throws Exception {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("http://testwisely.com/demo");
		Thread.sleep(1000);
		driver.quit();
	}
}
