package backup;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Flipkart {
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
//		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
//		
//		WebElement iphonePrice = driver.findElement(By.xpath("//div[text()='Apple iPhone 13 (Starlight, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
//		System.out.println(iphonePrice.getText());
//		
//		System.out.println(iphonePrice.getCssValue("color"));
//		
//		TakesScreenshot t = (TakesScreenshot) driver;
//		File src = t.getScreenshotAs(OutputType.FILE);
//		File dest = new File("./Screenshot/flipkart.png");
//		Files.copy(src, dest);
				
		
		WebElement t = driver.findElement(By.xpath("//img[@alt='Electronics']"));
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/flipkartlogo.png");
		Files.copy(src, dest);
		
		
		
		
	
	}

}
