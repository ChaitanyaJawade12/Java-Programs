package Java_Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Invalid_Login {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Java Programs\\Java_Selenium_Program\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secre");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
	}

}
