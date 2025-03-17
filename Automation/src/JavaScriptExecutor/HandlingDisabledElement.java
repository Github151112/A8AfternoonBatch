package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisabledElement {
	
	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		
		Thread.sleep(2000);
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		WebElement userName = driver.findElement(By.name("name"));
		j.executeScript("arguments[0].value='Aman Singh'",userName);
		
		
	}

}
