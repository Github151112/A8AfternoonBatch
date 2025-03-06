package actionsClass;

import org.openqa.selenium.By;

public class DoubleCLick extends BaseClass {
	
	public static void main(String[] args) {
		
		setUp("chrome", 20, "https://demoapps.qspiders.com/ui/button/buttonDouble?sublist=2");
		doubleClick(driver, driver.findElement(By.id("btn20")));
	
		
	}

}
