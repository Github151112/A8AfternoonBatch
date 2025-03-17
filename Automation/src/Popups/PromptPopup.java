package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class PromptPopup extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/alert/prompt?sublist=2");

		driver.findElement(By.id("buttonAlert1")).click();

		/*
		 * we need to switch the control from main page to alert popup
		 */
		Thread.sleep(3000);
		Alert a = driver.switchTo().alert();

		/*
		 * if i need to pass the value inside popup
		 */
		a.sendKeys("no");

		/*
		 * if i need to capture the msg of popup
		 */
		if (a.getText().equals("Do you like automation? [yes/no]")) {
			System.out.println("Msg is validated successfully");
		} else {
			System.out.println("Msg is not validated successfully");
		}

		/*
		 * if i want to click on ok button
		 */
		a.accept();

		/*
		 * if i want to click on cancel button
		 */
		// a.dismiss();

	}

}
