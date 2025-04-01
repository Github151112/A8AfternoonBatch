package LearningDataDriven;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchingDataFromExcel {

	static String excelPath="./src/main/resources/PracticeData.xlsx";
	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file = new FileInputStream(excelPath);
		
		Workbook book = WorkbookFactory.create(file);

		Sheet sheet = book.getSheet("IPL");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=2;j++)
			{
				System.out.print(sheet.getRow(i).getCell(j).getStringCellValue()+" ");
				
			}
			System.out.println();
		}

	}

}
