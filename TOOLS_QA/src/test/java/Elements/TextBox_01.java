package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TextBox_01 {

	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "F:\\Java Programs\\TOOLS_QA\\Drivers\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://demoqa.com/");
		
		driver.manage().window().maximize();
		
		WebElement Elements = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='home-content']/div[@class='home-body']/div[@class='category-cards']/div[1]"));
		Elements.click();
		
		WebElement TextBox = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-0']"));
		TextBox.click();
		
		WebElement Full_Name = driver.findElement(By.xpath("//input[@id='userName']"));
		Full_Name.sendKeys("Alon Musk");
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Email.sendKeys("alon_musk007@gmal.com");
		
		WebElement Currrent_Address = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		Currrent_Address.sendKeys("Los Angeles");
		
		WebElement Permanent_Address = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		Permanent_Address.sendKeys("Los Angeles");
		
		
		
		
	
		
		
		
	}

}
