package com.cucumber.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.CellType;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriver getDriver(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				 System.setProperty("webdriver.chrome.driver",
				 "F:\\SeleniumProject-even TC's\\SeleniumProject\\driver\\chromedriver.exe");
				//System.setProperty("webdriver.chrome.driver",
						//System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {
				System.setProperty("webdriver.ie.driver",
						System.getProperty("user.dir")+ "\\driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (browsername.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+
						"\\driver\\geckodriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("Invalid Browser Name");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		//	driver.manage().window().setPosition(new Point(0, -2000));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	//Wait Method
	public static void waitforvisibilityofelment(WebElement element) {
		try {
			WebDriverWait wd =new WebDriverWait(driver, 30);
			wd.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Mouseover
	public static void mouseover(WebElement element) {
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Current Url
	public String getCurrentUrl() {
		String currenturl = null;
		try {
			currenturl = null;
			currenturl = driver.getCurrentUrl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return currenturl;
	}

	// Scroll
	public void scroll(WebElement element) {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", element);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// sendkeys
	public static void setkey(WebElement element, String value) {
          waitforvisibilityofelment(element);
		try {
			if (element.isEnabled() && element.isDisplayed()) {
				element.clear();
				element.sendKeys(value);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	//isdisplayed
	public static boolean ElementIsDisplayed(WebElement element) {
	  return element.isDisplayed();
	}
	
	//Web table
	public static String webtable(WebElement element) {
	      String data = element.getAttribute("value");
	      return data;
	}

	// Get Title
	public static String gettitle() {
		try {
			String title = null;
			title = driver.getTitle();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	// dropdown
	public static void dropdown(WebElement element, String type, String i) {
		try {

			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select sc = new Select(element);
			if (type.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(i));
			}
		  if (type.equalsIgnoreCase("value")) {
				sc.selectByValue(i);
			} else if (type.equalsIgnoreCase("text")) {
				sc.selectByVisibleText(i);
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	
	}
	
	//Overloading Method example
//	public static void dropdown(WebElement element, String type, int i) {
//		try {
//			System.out.println("I am select by index");
//			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//			Select sc = new Select(element);
//			if (type.equalsIgnoreCase("index")) {
//				sc.selectByIndex(i);
//			}
////			else if (type.equalsIgnoreCase("value")) {
////				sc.selectByValue(i);
////			} else if (type.equalsIgnoreCase("text")) {
////				sc.selectByVisibleText(i);
////			}
//		} catch (NumberFormatException e) {
//			e.printStackTrace();
//		}
//	
//	}
	
	
	// Dropdown Get First Selected Text
	   public static String dropdownGetSelectedText(WebElement element,String type,String i) {
		   driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			Select sc = new Select(element);
			if (type.equalsIgnoreCase("index")) {
				sc.selectByIndex(Integer.parseInt(i));
			} else if (type.equalsIgnoreCase("value")) {
				sc.selectByValue(i);
			} else if (type.equalsIgnoreCase("text")) {
				sc.selectByVisibleText(i);
			}
		 String selectedtxt=sc.getFirstSelectedOption().getText();
		  return selectedtxt;
	}
	   
	   //Split and get first int value
	   public static int splitAndParseInt(String inputStr,String splithWith ) {
		   String[] splitedStr = inputStr.split(splithWith);
		    int noValue = Integer.parseInt(splitedStr[0].trim());
		return noValue;
		     
	}
	   //Extract numbers from string
	   public static int extratNosFromStr(String str) {
		   Pattern p = Pattern.compile("\\d+");
	        Matcher m = p.matcher(str);
	        if(m.find()) {
	            m.group();
	        } 
	        int valInt = Integer.parseInt(m.group());
		return valInt;

	}

	public static void clickElement(WebElement element) {

		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Data Driven
//	public static Map<String, String> GetExcelData() throws IOException {  
//		String cellVal = null;
//		String keyval="";
//		String path = "C:\\Users\\YazhiniS\\eclipse-workspace\\AutomationPractice\\Excel\\UserCredentials.xlsx";
//		File f = new File(path);
//		FileInputStream fis = new FileInputStream(f);
//		Workbook wb = new XSSFWorkbook(fis);
//		Sheet st = wb.getSheetAt(0);
//		Map<String, String> m = new HashMap<String, String>();
//		for (int i = 0; i < st.getPhysicalNumberOfRows(); i++) {
//			Row row = st.getRow(i);
//			for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {
//
//				// System.out.println(String.valueOf(row.getCell(j)));
//				Cell cell = row.getCell(j);
//				CellType cellFormat = cell.getCellType();
//				if (j == 0) {
//					if (cellFormat.equals(CellType.NUMERIC)) {
//						
//					double numericCellValue = cell.getNumericCellValue();
//					long value = (long) numericCellValue;
//					cellVal = String.valueOf(value);
//					keyval=cellVal;
//					m.put(cellVal,"");
//					}
//					else {
//					m.put(row.getCell(j).toString(), "");
//					keyval=row.getCell(j).toString();
//					}
//				}
//				else if (j == 1) {
//					  if (cellFormat.equals(CellType.NUMERIC)) {
//						double numericCellValue = cell.getNumericCellValue();
//						long value = (long) numericCellValue;
//						cellVal = String.valueOf(value);
//						m.put(keyval, cellVal);
//						}
//					  else {
//					  String Strkey = m.keySet().toArray()[i].toString();
//					  m.put(Strkey, row.getCell(j).toString());
//					  }
//					
//				}
//			}
//			
//			
//		}
//		return m;
//			
//	}
	// navigation method
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void navigateBack() {
		driver.navigate().back();
	}

	public static void navigateForword() {
		driver.navigate().forward();
	}

	public static void refresh() {
		driver.navigate().refresh();
	}

	public static void gettext(WebElement element) {
		element.getText();
	}
	// GetAtribute (value-Eg:Textbox Value)

	public static String getAttribute(WebElement element) {
		String str = element.getAttribute("value");
		return str;

	}
	// Get Atribute(Get the Attriburte value Eg:class ="css")

	public static String getattributeValue(WebElement element, String attrValue) {
		String str = element.getAttribute(attrValue);
		return attrValue;
	}

	// RadioButton
	public static void radiobutton(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	// Screenshot

	public static void screenshot() throws IOException {
		File des = new File("C:\\Users\\YazhiniS\\eclipse-workspace\\SeleniumProject\\Screenshot\\Test.png");
		TakesScreenshot tss = (TakesScreenshot) driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		String timestamp = new SimpleDateFormat("yyyyMMdd_hhmmss").format(Calendar.getInstance().getTime());
		String filename = "ErrorPicture";
		FileUtils.copyFile(src, des);
	}
	public static void windowhandling(WebElement element) {
		
	}

}
