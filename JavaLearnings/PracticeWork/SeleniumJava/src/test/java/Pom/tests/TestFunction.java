package Pom.tests;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import Pom.pages.Googlesearchpage;
public class TestFunction {
	
	static WebDriver driver = null;

	public static void main(String[] args) {

		googleSearch();
	}

	public static void googleSearch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.google.com/");

		
		//driver.findElement(By.name("q")).sendKeys("hello");
		Googlesearchpage.textbox(driver).sendKeys("Hi");
		
		//driver.findElement(By.name("q")).sendKeys(Keys.RETURN);
		Googlesearchpage.button(driver).sendKeys(Keys.RETURN);
		driver.close();

		System.out.println("Test completed");
	}
	//Organized/results/modular/Framework principles

}//How do u refer objects and methods from page objects
