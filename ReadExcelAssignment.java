package assignmentSelenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadExcelAssignment {


	WebDriver driver;
	
	@BeforeTest
	  public void beforeTest() throws InterruptedException {
		  
		  driver = new ChromeDriver();
		  driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
		  driver.manage().window().maximize();
		  Thread.sleep(2000);
		  
		  WebElement popupNotification = driver.findElement(By.id("wzrk-cancel"));
		  if (popupNotification.isDisplayed()) {
			  popupNotification.click();
		  }
	  }
	
	@Test
	public void ReadWriteData() {
		
		 String excelFilePath = "C:\\Users\\User\\ExcelABC\\MaturityValCalc.xlsx";
		
		try {
	          // Read from Excel file
          FileInputStream inputStream = new FileInputStream(excelFilePath);
          XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
			
          //Go to sheet to read from.  
		  XSSFSheet sheet = workbook.getSheet("maturityValCalculator");
			  
		  // Loop through each row (excluding header row)
			  for (int rowNum = 1; rowNum <= sheet.getLastRowNum(); rowNum++) {
			        XSSFRow row = sheet.getRow(rowNum);
			        
			        if (row == null) continue;
			     
			        // Get data from each cell
				       
	       String principal = row.getCell(0).getRawValue();
	       String rOIRate = row.getCell(1).getRawValue();
	       String periodVal = row.getCell(2).getRawValue();
	       String tenurePeriod = row.getCell(3).toString();
	       String frequencyData = row.getCell(4).toString();
		        	  
	       WebElement principalField = driver.findElement(By.id("principal")); 
	   	   principalField.clear();
	   	   principalField.sendKeys(String.valueOf(principal));
	   	   
	       WebElement roiField = driver.findElement(By.id("interest"));
	       roiField.clear();
	       roiField.sendKeys(String.valueOf(rOIRate));
	         
	       WebElement periodValField = driver.findElement(By.id("tenure"));
	       periodValField.clear();
	       periodValField.sendKeys(String.valueOf(periodVal));
	          
	       driver.findElement(By.id("tenurePeriod")).sendKeys(tenurePeriod); 
	       driver.findElement(By.id("frequency")).sendKeys(frequencyData);
	          
	         
	        //Click "enter principal details alert"
	        try {
	            
	        } catch (UnhandledAlertException e) {
	            Alert alert = driver.switchTo().alert();
	            String alertText = alert.getText();
	            System.out.println("Alert text: " + alertText);
	
	            // Handle the alert based on its text
	            if (alertText.contains("Please enter Principal value")) {
	            	 principalField.clear();
	            	 principalField.sendKeys(String.valueOf(principal)); // Enter a value for Principal
				                alert.accept();
				            } else {
				                alert.dismiss();
				            }
				        }
					 
	
	   
		                WebElement calculateButton = driver.findElement(By.xpath("//*[@id=\"fdMatVal\"]/div[2]/a[1]/img"));
			                calculateButton.click();
	 
	        
			                WebElement maturityVal = driver.findElement(By.id("resp_matval")); 
	        WebElement interestElement = driver.findElement(By.id("resp_intval"));
	
	        String maturityValue = maturityVal.getText();
	        String interestEarnedText = interestElement.getText();
	
	        // Write results back to Excel
	                row.createCell(5).setCellValue(maturityValue);
	                row.createCell(6).setCellValue(interestEarnedText);
	}
	          
	  		inputStream.close();  // Close inputStream

	  		// Write changes to output Excel file
	  		FileOutputStream outputStream = new FileOutputStream(excelFilePath);
      
	  		workbook.write(outputStream);
	  		outputStream.close();  // Close outputStream
	  		workbook.close();
	 

	      } catch (IOException e) {
	          e.printStackTrace();
	      }
	          
		
	}
	 @AfterClass
		public void close () {
		driver.close();
	}
}

 