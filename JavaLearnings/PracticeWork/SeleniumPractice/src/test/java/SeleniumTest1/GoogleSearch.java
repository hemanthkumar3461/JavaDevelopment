package SeleniumTest1;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class GoogleSearch {
	public static void main(String[] args) {
		
		// Create a new instance of the html unit driver
		// Notice that the remainder of the code relies on the interface,
		// not the implementation.
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		// And now use this to visit Google
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		// Find the text input element by its name
		WebElement element = driver.findElement(By.name("q"));
		assert driver.findElement(By.name("q")).isDisplayed();
		// Enter something to search for
		element.sendKeys("Hello Selenium WebDriver!");
		// Submit the form based on an element in the form
		element.submit();
		// Check the title of the page
		System.out.println("Page title is: " + driver.getTitle());
		
		driver.quit();
	}
}
