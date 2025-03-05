package Learmingxpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class Abosutexpath {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");

		WebElement registerLink = driver.findElement(By.xpath("/html/body/div/div/div/div/div/ul/li[1]/a"));
		registerLink.click();

		for (int i = 0; i <= 2; i++)
			driver.findElement(By.xpath("//li[text()='+']")).click();

	}

}
