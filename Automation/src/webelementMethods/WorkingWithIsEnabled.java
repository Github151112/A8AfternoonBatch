package webelementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithIsEnabled {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");

		WebElement username = driver.findElement(By.name("email"));
		System.out.println(username.isEnabled());
		if (username.isEnabled())
			username.sendKeys("hdghvsgvcgshdv");
		else
			System.out.println("Username text field is disabled");

		WebElement logo = driver.findElement(By.xpath("//img[@alt='Facebook']"));
		if (logo.isDisplayed())
			System.out.println("logo is displayed");
		else
			System.out.println("Logo is not displayed");
		
		System.out.println(logo.getAttribute("src"));

	}

}
