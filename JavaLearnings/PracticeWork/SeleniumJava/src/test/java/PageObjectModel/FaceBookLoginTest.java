package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FaceBookLoginTest {
	private static WebDriver driver;
	HomePage homePage;
	LoginPage loginPage;
	@BeforeClass
	public void openFBPage() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(4000);
		loginPage = new LoginPage(driver);
	}
	@Test
	public void loginToFB(){
		loginPage.enterUserName("username");
		loginPage.enterPassword("password");
		homePage = loginPage.clickLogin();
		System.out.println(homePage.getUserName());
	}

}