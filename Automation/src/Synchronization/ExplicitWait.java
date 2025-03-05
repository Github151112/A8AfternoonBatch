package Synchronization;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://shoppersstack.com/");

		driver.findElement(By.xpath("//span[text()='FASHION2WEAR ']")).click();
		driver.findElement(By.id("Check Delivery")).sendKeys("132424");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("Check")));
		wait.pollingEvery(Duration.ofSeconds(2));

		FluentWait w = new FluentWait(driver);
		w.withTimeout(Duration.ofSeconds(20));
		w.pollingEvery(Duration.ofSeconds(2));
		w.ignoring(TimeoutException.class);
		w.until(ExpectedConditions.elementToBeClickable(By.id("Check")));

		driver.findElement(By.id("Check")).click();

	}

}
