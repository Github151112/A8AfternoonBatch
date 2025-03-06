package actionsClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	static WebDriver driver;

	public static void setUp(String browser, int seconds, String url) {
		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else
			System.out.println("Invalid browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
		driver.get(url);

	}
	
	public static void doubleClick(WebDriver driver,WebElement element)
	{
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}

}
