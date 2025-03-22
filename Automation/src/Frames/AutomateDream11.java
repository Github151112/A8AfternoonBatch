package Frames;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import Popups.BaseClass;

public class AutomateDream11 extends BaseClass {
	
	public static void main(String[] args) throws AWTException {
		
		setUp("chrome", 20, "https://www.dream11.com/");
		/*
		 * 1st way : driver.switchTo().frame(0);
		 */
		
		/*
		 * 2nd way:driver.switchTo().frame("send-sms-iframe");
		 */
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='send-sms-iframe']")));
		
		driver.findElement(By.id("regEmail")).sendKeys("234567890");
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.id("hamburger")).click();
		
		
		
		
		
		
		
	}

}
