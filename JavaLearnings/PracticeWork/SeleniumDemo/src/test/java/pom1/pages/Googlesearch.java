package pom1.pages;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Googlesearch {
	WebDriver driver = null;
	By textbox = By.name("q");
	
	By button = By.name("btnK");
	public Googlesearch(WebDriver driver){
		this.driver = driver;
	}
	
	public void settext(String text) {
		driver.findElement(textbox).sendKeys(text);
	}
	
	public void click() {
		driver.findElement(button).sendKeys(Keys.RETURN);
	}

}
