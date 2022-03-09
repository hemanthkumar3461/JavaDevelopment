package Pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//We use different class files for storing the webpage locators/objects
//For each webpage, there should always be a page class

public class Googlesearchpage {

	private static WebElement element = null;
	public static WebElement textbox(WebDriver driver) {
	element = driver.findElement(By.name("q"));
	return element;
	}
	
	
	public static WebElement button(WebDriver driver) {
	element = driver.findElement(By.name("q"));
	return element;
	}
	
	//Here we identifies web objects in a class of a single webpage
	
	//We can also see where all the object locators and methods in a single class for every webpage and just refer objects in the testcase
	//Similarlly we can find all the locator objects for multiple webpages and store them in a class and refer through testcases
	//Refer the objects from pages class
	
	
}
