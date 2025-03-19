package Popups;

import org.openqa.selenium.By;

public class HandlingCalendarPopup extends BaseClass {

	public static void main(String[] args) {

		String yearMonth = "November 2025";
		int day = 26;
		setUp("chrome", 1, "https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class='logSprite icClose']")).click();
		driver.findElement(By.xpath("//span[text()='Departure']")).click();
		for (;;) {
			try {
				String xpath = "//div[text()='" + yearMonth
						+ "']/ancestor::div[@class='DayPicker-Month']/descendant::p[text()='" + day + "']";
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}
	}

}
