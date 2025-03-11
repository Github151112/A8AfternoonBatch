package actionsClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy extends BaseClass {
	
	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://www.flipkart.com");
		
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		WebElement dragPointer = driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']/div[@class='PYKUdo']"));
	
		Actions a = new Actions(driver);
		a.dragAndDropBy(dragPointer, 100, 0).perform();
		
		a.click(dragPointer).perform();
	
	}

}
