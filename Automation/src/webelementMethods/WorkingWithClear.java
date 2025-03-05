package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithClear {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.name("email"));
		Thread.sleep(2000);
		username.sendKeys("aman@gmail.com");
		Thread.sleep(2000);
		username.clear();
		Thread.sleep(2000);
		username.sendKeys("amansingh@gmail.com");
		
		
	}

}
