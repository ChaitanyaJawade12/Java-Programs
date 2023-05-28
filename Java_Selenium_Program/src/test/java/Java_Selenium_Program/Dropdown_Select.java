package Java_Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Select {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "F:\\Java Programs\\Java_Selenium_Program\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		username.sendKeys("standard_user");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("secret_sauce");
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//Dropdown or Select
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		
		Select sc = new Select(dropdown);
		
		Thread.sleep(3000);
//		sc.selectByIndex(1);
//		sc.selectByValue("za");
		sc.selectByVisibleText("Name (Z to A)");
	}

}
