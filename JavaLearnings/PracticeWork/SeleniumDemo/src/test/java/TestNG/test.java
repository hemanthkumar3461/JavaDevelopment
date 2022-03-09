package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class test {
	WebDriver driver = null;
	@BeforeTest
	public void setUp() {
		
		
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path +"\\Drivers\\ChromeDriver\\chromedriver.exe");
		//If we set chromedriver path in environment variable then we we can access chrome from anywhere
		
	}
	@Test
	public void googlesearch() {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://github.com/hemanthkumar3461");
		
		driver.findElement(By.xpath("/html/body/div[4]/main/div[2]/div/div[2]/div[2]/div/div[1]/div/ol/li[1]/div/div/div/a/span")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("/html/body/div[4]/div/main/div[2]/div/div/div[3]/div[1]/div[2]/div[3]/div[1]/div[5]/div[2]/span/a")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}
	@AfterTest
	public void tearDown() {
		driver.close();
		System.out.println("Driver closed");
	}

}
