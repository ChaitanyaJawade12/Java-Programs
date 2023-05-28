package Java_Selenium_Program;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tool_Tip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "F:\\Java Programs\\Java_Selenium_Program\\Drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/tooltip/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
		System.out.println("this is the message of age :- " + age.getAttribute("title"));
		
	}

}
