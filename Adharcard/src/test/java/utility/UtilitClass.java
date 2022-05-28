package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;

public class UtilitClass {
	
	WebDriver driver;

	
	static int  i;

	public static void CaptureScreenshot(WebDriver driver) throws IOException
	{
	 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	
	File f = new File("D:\\ScreenShot\\gauri"+i+".jpeg");
	 
	
   FileHandler.copy(src, f);
   i=i+1;
   
	
	}
	
	public static String XLdata(int row,int cell) throws EncryptedDocumentException, IOException
	{
        String path="D:\\Book1.xlsx";
    	
		FileInputStream file=new FileInputStream(path);
		
		Sheet s = WorkbookFactory.create(file).getSheet("gauri");
				String g=s.getRow(row).getCell(cell).getStringCellValue();
		
		
		
		System.out.println(g);
		return g;
	
	}
	
	
	
	
	
	
	
}
