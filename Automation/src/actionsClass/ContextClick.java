package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ContextClick extends BaseClass {
	
	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://www.paytm.com");
		
		Actions a = new Actions(driver);
		a.contextClick(driver.findElement(By.xpath("//div[text()='Download App']"))).perform();
		
	}

}
