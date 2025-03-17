package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertPopup extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", 20, "http://demoapps.qspiders.com/ui/alert?sublist=0");

		driver.findElement(By.id("buttonAlert2")).click();
		
		/*
		 * we need to switch the control from main page to alert popup
		 */
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();
		a.accept();

	}

}
