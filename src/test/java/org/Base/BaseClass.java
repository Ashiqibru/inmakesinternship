package org.Base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);
	}

	public static String pageTitle() {
		String title = driver.getTitle();
		return title;
	}

	public static String PageUrl() {
		String pageurl = driver.getCurrentUrl();
		return pageurl;
	}

	public static void passText(String txt, WebElement ele) {
		ele.sendKeys(txt);
	}

	public static void closeEntireBrowser() {
		driver.quit();
	}

	public static void ClickBtn(WebElement ele) {
		ele.click();
	}

	public static void screenShot(String img) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File image = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ imgName.png");
		FileUtils.copyFile(image, f);
	}

	public static Actions a;

	public static void MoveToCursor(WebElement targetWebElement) {
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}

	public static void dragDrop(WebElement dragWebElemnt, WebElement dropElement) {
		a = new Actions(driver);
		a.dragAndDrop(dragWebElemnt, dropElement).perform();
	}
     
	public static Robot r;
	
	private static void enterbtn() throws AWTException {
		r = new Robot();
		 r.keyPress(KeyEvent.VK_ENTER);
	     r.keyRelease(KeyEvent.VK_ENTER);

	}
	public static JavascriptExecutor js;

	public static void scrollThePage(WebElement tarWebEle) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", tarWebEle);
	}

	public static void scroll(WebElement element) {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}

	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		File f = new File("excellocation.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Data");
		Row r = mysheet.getRow(rowNum);
		Cell c = r.getCell(cellNum);
		int cellType = c.getCellType();

		String value = "  ";
		if (cellType == 1) {
			String value2 = c.getStringCellValue();
		} else if (DateUtil.isCellDateFormatted(c)) {
			Date dd = c.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat("dd-MM-yyyy");
			String value1 = s.format(dd);
		} else {
			double d = c.getNumericCellValue();
			long l = (long) d;
			String valueof = String.valueOf(l);
		}

	}

	public static void createNewExcelFile(String writeData, int rowNum, int cellNum) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenProject\\Excelfolder\\newfile.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet mysheet = wb.createSheet("Datas");
		Row newr = mysheet.createRow(rowNum);
		Cell newc = newr.createCell(cellNum);
		newc.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void createCell(String newData, int getrow, int crecell) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenProject\\Excelfolder\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Datas");
		Row newr = mysheet.getRow(getrow);
		Cell newc = newr.createCell(crecell);
		newc.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void createRow(String newData, int crerow, int crecell) throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenProject\\Excelfolder\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Datas");
		Row newr = mysheet.createRow(crerow);
		Cell newc = newr.createCell(crecell);
		newc.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}

	public static void updateDatatoparcell(String existingData, String WritenewData, int getTheRow, int getThecell)
			throws IOException {
		File f = new File("C:\\Users\\ELCOT\\eclipse-workspace\\MavenProject\\Excelfolder\\newfile.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Datas");
		Row newr = mysheet.getRow(getTheRow);
		Cell newc = newr.getCell(getThecell);
		String str = newc.getStringCellValue();
		if (str.equals(existingData)) {
			newc.setCellValue(WritenewData);
		}
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
}