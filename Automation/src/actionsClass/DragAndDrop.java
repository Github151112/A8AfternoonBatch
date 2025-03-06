package actionsClass;

import org.bouncycastle.jcajce.provider.symmetric.ARC4.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop extends BaseClass {

	public static void main(String[] args) {

		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=2");

		WebElement source = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement target = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target).perform();
	}

}
