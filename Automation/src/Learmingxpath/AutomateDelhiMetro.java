package Learmingxpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateDelhiMetro {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://delhimetrorail.com/");
		
		//click on from station
		WebElement fromTextField = driver.findElement(By.xpath("//input[@id='FromStation']"));
		fromTextField.click();
		
		//click on line2
		WebElement line2 = driver.findElement(By.xpath("//div[text()='MILLENNIUM CITY CENTRE GURUGRAM']"));
		line2.click();
		
		//click on jahangirpuri
		WebElement station = driver.findElement(By.xpath("//font[text()='JAHANGIRPURI']"));
		station.click();
	}

}
