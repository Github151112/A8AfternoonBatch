package LearningDataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateFlipkart {
	static String excelPath = "./src/main/resources/PracticeData.xlsx";

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com");
		driver.findElement(By.name("q")).sendKeys("iphone", Keys.ENTER);
		List<WebElement> allIphones = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		FileInputStream f = new FileInputStream(excelPath);
		Workbook book = WorkbookFactory.create(f);
		Sheet sheet = book.createSheet("IPHONES");
		Row row;
		int row1 = 0;
		for (WebElement iphones : allIphones) {
			row = sheet.createRow(row1++);
			row.createCell(0).setCellValue(iphones.getText());

		}
		FileOutputStream file = new FileOutputStream(excelPath);
		book.write(file);
		book.close();

		System.out.println("data entered");

	}

}
