package Java_Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Credentials {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Java Programs\\Java_Selenium_Program\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		Thread.sleep(3000);
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		Thread.sleep(3000);
		password.sendKeys("secret_sauce");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
	}

}
