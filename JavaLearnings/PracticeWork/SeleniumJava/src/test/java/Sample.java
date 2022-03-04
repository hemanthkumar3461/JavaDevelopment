import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.mongodb.MapReduceCommand.OutputType;

public class Sample
{
	
 public static void main (String[] args)
 {

 System.setProperty("webdriver.gecko.driver", "C:\\Users\\heman\\Desktop\\UST_Workspace\\chromedriver.exe");
 WebDriver driver = new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://www.google.com/");
 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
 try {
 //Save Screenshot in destination file
 FileUtils.copyFile(src, new File("D:\\screenshot.png"));
 } catch (IOException e) {
 e.printStackTrace();
 }
 }
}
