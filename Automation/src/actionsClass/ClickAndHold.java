package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/clickHold?sublist=0");
		
		Actions a = new Actions(driver);
		a.clickAndHold(driver.findElement(By.id("circle"))).perform();
		Thread.sleep(3000);
		a.release().perform();
		
		
		
		
		
	}

}
