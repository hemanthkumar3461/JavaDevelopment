package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	@FindBy(xpath=".//a[@data-testid='blue_bar_profile_link']/span")
	private WebElement userName;
	public String getUserName(){
		if(userName.isDisplayed()) {
			return userName.getText();
		}
		else {
			return "Username is not present";
		}
	}
}