package Assignment;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateMyntra {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/jeans?rawQuery=jeans");
		
		List<WebElement> productName = driver.findElements(By.xpath("//h3[@class='product-brand']"));
		
		TreeSet<String> t = new TreeSet<String>();
		
		for(WebElement name:productName)
		{
			t.add(name.getText());
		}
		
		
		for(String p:t)
			System.out.println(p);
	}

}
