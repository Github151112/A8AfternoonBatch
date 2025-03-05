package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithSubmit {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		
		
		driver.findElement(By.name("q")).sendKeys("iphone");
		
		
		
		
		driver.findElement(By.xpath("//button[@title='Search for Products, Brands and More']")).submit();
		
		
		
	}

}
