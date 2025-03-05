package searchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://www.flipkart.com/search?q=iphone&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off");
	
		List<WebElement> productName = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		
		for(int i=0;i<productName.size();i++)
		{
			if(productName.get(i).getText().equals("Apple iPhone 16 (Pink, 256 GB)"))
			{
				System.out.println(productName.get(i).getText());
			}
		}

	}

}
