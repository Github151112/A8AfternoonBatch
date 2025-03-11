package KeyBoardActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class LearningKeysEnum extends BaseClass {
	
	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin",Keys.TAB,"admin123",Keys.TAB,Keys.ENTER);
		
	}

}
