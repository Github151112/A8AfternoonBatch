package LearningDataDriven;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteTheDataIntoExcel {
	
	static String excelPath="./src/main/resources/PracticeData.xlsx";
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f = new FileInputStream(excelPath);
		Workbook book = WorkbookFactory.create(f);
		Sheet sheet = book.getSheet("IPL");
		Row row = sheet.getRow(1);
		Cell cell = row.createCell(3);
		cell.setCellValue("PASS");
		FileOutputStream file = new FileOutputStream(excelPath);
		book.write(file);
		book.close();
		System.out.println("Data entered successfully");
		/*
		 * make sure that if you are writing the data into 
		 * excel you should close your excel file otherwise u will get FileNotFound Exception.
		 */
	}

}
