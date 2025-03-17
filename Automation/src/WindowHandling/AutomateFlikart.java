package WindowHandling;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFlikart {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");

		driver.findElement(By.name("q")).sendKeys("redmi phones", Keys.ENTER);

		List<WebElement> allPhones = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));

		int count = 0;
		for (WebElement phones : allPhones) {
			String str = phones.getText();
			if (str.equals("REDMI A3X (Ocean Green, 64 GB)")) {
				phones.click();
				count++;
			}

		}
		if (count == 0)
			System.out.println("The product is not found");

		String parentId = driver.getWindowHandle();
		Set<String> allId = driver.getWindowHandles();

		for (String id : allId) {
			driver.switchTo().window(id);
			if (driver.getTitle()
					.equals("REDMI A3X ( 64 GB Storage, 4 GB RAM ) Online at Best Price On Flipkart.com")) {
				break;
			}
		}

		driver.findElement(By.xpath("//button[text()='Buy Now']")).click();

		driver.switchTo().window(parentId);

		driver.findElement(By.xpath("//a[@class='CDJO0-']/span")).click();
	}

}
