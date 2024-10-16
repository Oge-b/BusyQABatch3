package assignmentSelenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;




public class WebTableAssignment {
	WebDriver driver;
	 
	@BeforeClass
	  public void beforeClass() throws InterruptedException  {
		
			  driver = new ChromeDriver();
			  driver.get("https://the-internet.herokuapp.com/tables");
			  Thread.sleep(2000);
			  
	  }
	@AfterClass
		public void close () {
		driver.close();
	}
	
	@Test (priority = 1)
	public void Test1() {
		//identify the table:
		WebElement table = driver.findElement(By.xpath("//table[@id='table2']"));
		List<WebElement> rows = table.findElements(By.tagName("tr"));
		
		System.out.println("Number of rows in the table: " + rows.size());
 

        for (int i = 1; i < rows.size(); i++) {
        WebElement row = rows.get(i);
        // Find all columns in the row
        List<WebElement> columns = row.findElements(By.tagName("td"));
        System.out.print("No. of columns are: "+columns.size() + "\t");
        // Iterate through columns and print data
        for (WebElement column : columns) {
            System.out.print(column.getText() + "\t");
        }
    System.out.println(); // Move to the next row
	}
}
	
	@Test (priority = 2)
	public void Test2() {
		WebElement table = driver.findElement(By.xpath("//table[@id='table2']"));
		List<WebElement> rows = table.findElements(By.xpath("//table[@id='table2']/tbody/tr"));
		String[][] expectedValues = {
			{"Smith", "John", "jsmith@gmail.com", "$50.00"},
			{"Bach", "Frank", "fbach@yahoo.com" ,"$51.00"},
			{"Doe", "Jason", "jdoe@hotmail.com", "$100.00"},
			{"Conway", "Tim", "tconway@earthlink.net", "$50.00"},
		};
		
		 
		 Assert.assertEquals(rows.size(), expectedValues.length, "Row count mismatch.");

	        for (int i = 0; i < rows.size(); i++) {
	            WebElement row = rows.get(i);
	            String lastName = row.findElement(By.xpath("./td[1]")).getText();
	            String firstName = row.findElement(By.xpath("./td[2]")).getText();
	            String email = row.findElement(By.xpath("./td[3]")).getText();
	            String due = row.findElement(By.xpath("./td[4]")).getText();

	            Assert.assertEquals(lastName, expectedValues[i][0], "Last Name mismatch at row " + (i + 1));
	            Assert.assertEquals(firstName, expectedValues[i][1], "First Name mismatch at row " + (i + 1));
	            Assert.assertEquals(email, expectedValues[i][2], "Email mismatch at row " + (i + 1));
	            Assert.assertEquals(due, expectedValues[i][3], "Due mismatch at row " + (i + 1));
	        }
	    }
	@Test (priority = 3)
	
	public void Test3() {
		
		WebElement specificCell = driver.findElement(By.xpath("//*[@id=\"table2\"]/tbody/tr[2]/td[5]"));
	    
	    // Get the text of the link
	    String linkText = specificCell.getText();
	    
	    // Print the link text
	    System.out.println("Link text in the 2rd row and 5th column: " + linkText);
	    driver.get(linkText); 
	    
	    //Get Title
	    String title = driver.getTitle();
	       System.out.println("Page Title: " + title);
	       String desired_title = "Bitcoin is Hope";
	       if(title.equals(desired_title)) {
	          	System.out.println("Pass");
	          }
	          else {
	          	System.out.println("Fail");
	          }
		
            }
	}
