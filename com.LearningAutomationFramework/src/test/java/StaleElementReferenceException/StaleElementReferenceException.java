package StaleElementReferenceException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementReferenceException {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");

		LoginPage lp = new LoginPage(driver);
		WebElement username = lp.getEmailTextField();
		driver.navigate().refresh();
		username.sendKeys("hbdvchsdvhcv");

	}

}
