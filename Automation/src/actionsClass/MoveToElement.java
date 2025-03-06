package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MoveToElement extends BaseClass {

	public static void main(String[] args) {

		setUp("edge", 20, "https://www.paytm.com");
		WebElement ticketBooking = driver.findElement(By.xpath("//li[text()='Ticket Booking']"));
		Actions a = new Actions(driver);
		a.moveToElement(ticketBooking).perform();
		driver.findElement(By.linkText("Movie Tickets")).click();

	}

}
