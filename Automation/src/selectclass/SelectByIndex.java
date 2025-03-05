package selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByIndex {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/r.php?entry_point=login");

		// identify the static dropdown
		WebElement day = driver.findElement(By.id("day"));

		// create the object of select class
		Select s = new Select(day);
		
		List<WebElement> allOptions = s.getOptions();

		for (int i = 0; i < allOptions.size(); i++) {
			s.selectByIndex(i);
		}

	}

}
