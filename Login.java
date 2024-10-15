package assignmentSelenium;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login {
	WebDriver driver;
	
	 @BeforeTest
	 public void beforeTest() {
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		  
	  }
	 
	 @Test
		public void WrongUsernameWrongPassword () {
		
			//Maximize Browser
			driver.manage().window().maximize();
			driver.findElement(By.name("username")).sendKeys("user");
			driver.findElement(By.name("password")).sendKeys("user123");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
			
			 // Retrieve the error message
	        String errorMessage = driver.findElement(By.cssSelector(".error-message")).getText(); // Update selector as needed

	        // Expected error message
	        String expectedMessage = "Invalid Credentials";

	        // Check if the error message is present and matches the expected message
	        if (errorMessage.contains(expectedMessage)) {
	        	throw new IllegalArgumentException("The expected error message was not displayed: " + errorMessage);
	            
	        } else {
	            System.out.println("Error message displayed correctly: " + errorMessage);
	        }
		
       }
	        
	 
	 @Test
		public void CorrectUsernameWrongPassword() {
			
			//Maximize Browser
			driver.manage().window().maximize();
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("user123");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
			 // Retrieve the error message
	        String errorMessage = driver.findElement(By.cssSelector(".error-message")).getText(); // Update selector as needed

	        // Expected error message
	        String expectedMessage = "Invalid Credentials"; // Replace with the actual expected message

	        // Check if the error message is present and matches the expected message
	        if (errorMessage.contains(expectedMessage)) {
	        	throw new IllegalArgumentException("The expected error message was not displayed: " + errorMessage);
	            
	        } else {
	            System.out.println("Error message displayed correctly: " + errorMessage);
	        }
	       
	}
	 @Test
		public void WrongUsernameCorrectPassword() {
		 
			//Maximize Browser
			driver.manage().window().maximize();
			driver.findElement(By.name("username")).sendKeys("user");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
			
			 // Retrieve the error message
	        String errorMessage = driver.findElement(By.cssSelector(".error-message")).getText(); // Update selector as needed

	        // Expected error message
	        String expectedMessage = "Invalid Credentials"; // Replace with the actual expected message

	        // Check if the error message is present and matches the expected message
	        if (errorMessage.contains(expectedMessage)) {
	        	throw new IllegalArgumentException("The expected error message was not displayed: " + errorMessage);
	            
	        } else {
	            System.out.println("Error message displayed correctly: " + errorMessage);
	        }
	       
	} 
	 
	 
	@Test
	public void CorrectUsernameCorrectPassword()  {
		
		//Maximize Browser
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		//Verify Title
		
		String title = driver.getTitle();
       System.out.println("Page Title: " + title);
       String desired_title = "OrangeHRM";
      
       
       if(title.equals(desired_title)) {
       	System.out.println("Pass");
       }
       else {
       	System.out.println("Fail");
       }
       //click admin details
       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/span/p")).click();
       
       //click logout and print result
       driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[3]/ul/li/ul/li[4]/a")).click();
       System.out.println("Logged out successfully.");
       
       // Close the driver
       driver.quit();
	}
	 

}
