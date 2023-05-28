package Java_Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Java Programs\\Java_Selenium_Program\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.apple.com/in/?cid-oas-in-domains-apple.in/"); 
		
		driver.manage().window().maximize();
		
		//Scroll
		WebElement Store = driver.findElement(By.xpath("//a[@class='ac-gf-directory-column-section-link'][normalize-space()='Store']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView()", Store);
		Store.click();
		
		
				
			
		
	}

}
