package takesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotOfParticularWebelement {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/restaurants");
		
		
		WebElement t = driver.findElement(By.xpath("//img[@alt='restaurants curated for biryani']"));
		//use getScreenshotAs()
		File src = t.getScreenshotAs(OutputType.FILE);
		//create a new file
		File dest = new File("./Screenshot/biryani.png");
		//copy
		Files.copy(src, dest);
		
		
		
		
	}

}
