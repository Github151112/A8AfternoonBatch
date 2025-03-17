package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class ConfirmationPopup extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/alert/confirm?sublist=1");

		driver.findElement(By.id("buttonAlert5")).click();

		/*
		 * we need to switch the control from main page to alert popup
		 */
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();

		/*
		 * if i want to click on ok button
		 */
		a.accept();

		/*
		 * if i want to click on cancel button
		 */
		a.dismiss();

	}

}
