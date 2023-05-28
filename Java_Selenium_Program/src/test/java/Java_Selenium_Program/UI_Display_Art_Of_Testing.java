package Java_Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UI_Display_Art_Of_Testing {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Java Programs\\Java_Selenium_Program\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();;
		
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		driver.manage().window().maximize();
		
		WebElement Link = driver.findElement(By.xpath("//a[normalize-space()='This is a link']"));
		System.out.println("This Link is Displayed :- " + Link.isDisplayed());
		System.out.println("This Link is Enabled :- " + Link.isEnabled());
		System.out.println("This Link is Selected :- " + Link.isSelected());
		
		
	}

}
