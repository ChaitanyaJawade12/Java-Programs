package Java_Selenium_Program;

import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_New_Tab_Window {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Java Programs\\Java_Selenium_Program\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
//		driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://www.apple.com/in/?cid-oas-in-domains-apple.in/");
		
	}

}
