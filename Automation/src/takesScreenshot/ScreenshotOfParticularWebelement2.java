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

public class ScreenshotOfParticularWebelement2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		Thread.sleep(5000);
		
		WebElement t = driver.findElement(By.xpath(
				"//img[contains(@src,'https://rukminim2.flixcart.com/fk-p-flap/480/80/image/220680d2dbe968b4.jpeg?q=20')]"));
		// use getScreenshotAs()
		File src = t.getScreenshotAs(OutputType.FILE);
		// create a new file
		File dest = new File("./Screenshot/phone.png");
		// copy
		Files.copy(src, dest);

	}

}
