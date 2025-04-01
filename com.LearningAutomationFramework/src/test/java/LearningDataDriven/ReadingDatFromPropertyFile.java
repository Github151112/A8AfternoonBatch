package LearningDataDriven;

import java.io.IOException;
import java.net.http.WebSocket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadingDatFromPropertyFile {

	static String path = "./src/main/resources/Data.properties";
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		String browser = FileUtility.getDataFromProperty(path, "browser");
		String url = FileUtility.getDataFromProperty(path, "url");

		if (browser.equalsIgnoreCase("chrome"))
			driver = new ChromeDriver();
		else if (browser.equalsIgnoreCase("firefox"))
			driver = new FirefoxDriver();
		else if (browser.equalsIgnoreCase("edge"))
			driver = new EdgeDriver();
		else
			System.out.println("Invalid browser");

		driver.manage().window().maximize();
		driver.get(url);

	}

}
