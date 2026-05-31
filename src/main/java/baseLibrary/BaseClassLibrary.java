package baseLibrary;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

import applicationUtility.ApplicationUtility;
import excelUtility.ExcelUtility;

public class BaseClassLibrary implements ExcelUtility ,ApplicationUtility
{
	//String path="C:\\Users\\Av\\eclipse-workspaceApril_2026\\25May2026_MavenAutomationTestingBabaProject\\TestData_25May2026\\testdata.xlsx";
	 public static WebDriver driver;
     public void LaunchUrl(String url)
     {
    	 driver = new ChromeDriver();
    	 driver.get(url);
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
     }
     
    @AfterTest
     public void closedBrowser()
     {
    	 driver.quit();
     }

	 @Override
	 public String getReadExceldata(String path, int sheetno, int rowno, int colno)
	 {
		 
		 String value="";
		 try 
		 {
			FileInputStream fis = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			XSSFSheet sheet= wb.getSheetAt(sheetno);
			value=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		 } 
		 catch (Exception e) 
		 {
			
		 }
		return value;
	 }

	 @Override
	 public void DoubleClick(WebElement ele) 
	 {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
		
	 }

	 @Override
	 public void RightClick(WebElement ele)
	 {
		Actions act= new Actions(driver);
		act.contextClick(ele).perform();
		
	 }

	 @Override
	 public void ChangeWindow(int indexno) 
	 {
		Set<String>tabs= driver.getWindowHandles();
		ArrayList<String>tabno = new ArrayList(tabs);
		driver.switchTo().window(tabno.get(indexno));
		
	 }

	
}
