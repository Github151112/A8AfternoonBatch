package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateBlinit {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blinkit.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Detect my location']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='SearchBar__AnimationWrapper-sc-16lps2d-1 iJnYYS']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search for atta dal and more']")).sendKeys("vegetables");
		Thread.sleep(2000);
		List<WebElement> allVegetables = driver
				.findElements(By.xpath("//div[@class='Product__UpdatedTitle-sc-11dk8zk-9 hxWnoO']"));
		Thread.sleep(2000);
		for (WebElement veg : allVegetables) {
			if (veg.getText().equals("Lady Finger (Bhindi)"))
			{
				veg.click();
				break;
			}
			
		}

	}

}
