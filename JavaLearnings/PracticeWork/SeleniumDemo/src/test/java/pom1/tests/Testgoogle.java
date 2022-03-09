package pom1.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import pom1.pages.Googlesearch;

public class Testgoogle {
	static WebDriver driver = null;
	public static void main(String[] args) {
		
		
		googlesearch();
	}
	
	public static void googlesearch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		Googlesearch s = new Googlesearch(driver);
		
		driver.get("https://www.google.com/");
		s.settext("Hi");
		
		s.click();
		
		driver.close();
	}

}
