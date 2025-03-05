package Learmingxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class DynamicXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");

		WebElement searchTextField = driver.findElement(By.name("q"));
		searchTextField.sendKeys("iphone", Keys.ENTER);

		WebElement price = driver.findElement(By.xpath(
				"//div[text()='Apple iPhone 13 (Midnight, 128 GB)']/ancestor::div[@class='yKfJKb row']/descendant::div[@class='Nx9bqj _4b5DiR']"));
		System.out.println(price.getText());
	}

}
