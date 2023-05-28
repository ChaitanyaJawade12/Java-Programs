package Java_Selenium_Program;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Java Programs\\Java_Selenium_Program\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://artsandculture.google.com/project/natural-history");
		
		driver.manage().window().maximize();
		
		//ScrenShot
		Thread.sleep(4000);
		TakesScreenshot ts = (TakesScreenshot)driver;;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File(".\\Screenshots\\natural-history.png");
		FileHandler.copy(source, target);
		
		
	}

}
