package Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatePaytm {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com");

		// CLICK ON TRAINS
		driver.findElement(By.xpath("//span[text()='Trains']")).click();

		driver.findElement(By.id("sourceInput")).click();
		driver.findElement(By.xpath("//div[text()='Howrah Jn']")).click();

		driver.findElement(By.id("destinationInput")).click();
		driver.findElement(By.xpath("//div[text()='New Delhi']")).click();

		driver.findElement(By.xpath("//div[text()='27']")).click();

		driver.findElement(By.xpath("//div[text()='Search Trains']")).click();

		List<WebElement> allTrains = driver.findElements(By.xpath("//div[@class='k9j0o']"));

		for (WebElement t : allTrains)
			System.out.println(t.getText());

	}

}
