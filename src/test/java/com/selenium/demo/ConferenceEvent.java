package com.selenium.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConferenceEvent {
	 public static void main(String[] args) throws InterruptedException {
	        System.out.println("Login functionality to be implemented.");
	        System.setProperty("webdriver.chrome.silentOutput", "true");
	        java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(java.util.logging.Level.SEVERE);

	        // Set the path to ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");
	        // Launch browser
	        WebDriver driver = new ChromeDriver();
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        driver.get("https://dragon.tradewing-staging.com/login");
	        Thread.sleep(3000);

	        WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//button[normalize-space()='Sign in with your Tradewing Account']")));
	        signInButton.click();
	        Thread.sleep(2000);

	        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.cssSelector("input[type='email'][name='email']")));
	        emailField.sendKeys("rutu.gajjar@tradewing.com");
	        Thread.sleep(2000);

	        // Clear the password field before entering new text
	        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.cssSelector("input[type='password'][name='password']")));
	        passwordField.sendKeys("techify123");
	        Thread.sleep(2000);

	        WebElement signInButton1 = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//button[@type='submit' and normalize-space()='Sign In']")));
	        signInButton1.click();
	        Thread.sleep(5000);

	        WebElement accountMenuBtn = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//button[@aria-label='account menu']")));
	        accountMenuBtn.click();
	        Thread.sleep(2000);
	        WebElement adminSiteBtn = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//button[.//span[normalize-space()='Admin Site']]")));
	        adminSiteBtn.click();
	        Thread.sleep(3000);
	        
	        WebElement eventsLink = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//a[@href='/admin/events' and contains(.,'Events')]")
	        ));

	        // Click the Events link
	        eventsLink.click();

	        System.out.println("Navigated to Events page");
	        Thread.sleep(3000);
	        WebElement createEventBtn = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//button[.//span[contains(text(),'Create an Event')]]")
	        ));
	        createEventBtn.click();
	        System.out.println("Clicked on 'Create an Event' button");
	        
	        
	        Thread.sleep(3000);
	     // using button text
	        WebElement createConferenceBtn = driver.findElement(
	            By.xpath("//button[.//p[normalize-space()='Create a Conference']]")
	        );
	        createConferenceBtn.click();
	        Thread.sleep(3000);
	        WebElement eventNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//input[@placeholder='Give the event a name']")
	        ));

	       
	        Thread.sleep(2000);

	        eventNameInput.click();
	        Thread.sleep(1000);
	        eventNameInput.sendKeys("My Automation Conference Test Event");

	        
	        System.out.println("Entered Event Name: My Automation Test Event");

	        
	        Thread.sleep(2000);
	    
	        WebElement descriptionEditor = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[contains(@class,'public-DraftStyleDefault-block')]")
	        ));

	       
	        Thread.sleep(1000);

	       
	        descriptionEditor.click();
	        Thread.sleep(1000);

	       
	        descriptionEditor.sendKeys("This is an automated Conference event description.");

	       
	        System.out.println("Entered event description");

	        
	        Thread.sleep(2000);
	     
	        WebElement startDateTime = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("(//input[@placeholder='Enter date and time'])[1]")
	        ));
	        Thread.sleep(2000);
	        startDateTime.sendKeys(Keys.CONTROL + "a"); // Select all
	        startDateTime.sendKeys(Keys.DELETE);        // Delete existing
	        Thread.sleep(1000);
	        startDateTime.sendKeys("Sep 10, 2025 10:00 AM");
	        System.out.println("Entered Start Date & Time");

	        // End Date & Time field
	        WebElement endDateTime = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("(//input[@placeholder='Enter date and time'])[2]")
	        ));
	        Thread.sleep(2000);
	        endDateTime.sendKeys(Keys.CONTROL + "a"); // Select all
	        endDateTime.sendKeys(Keys.DELETE);        // Delete existing
	        Thread.sleep(1000);
	        endDateTime.sendKeys("Sep 10, 2025 12:00 PM");
	        System.out.println("Entered End Date & Time");

	        
	     // Close the datepicker first
	     // Close date picker by clicking outside
	        Thread.sleep(2000);

	        WebElement onlineRadio = driver.findElement(By.xpath("//label[.//p[normalize-space()='Online']]"));
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", onlineRadio);

	        
	        // Now click Online radio
//	        WebElement onlineRadio = driver.findElement(
//	            By.xpath("//label[.//p[normalize-space()='Online']]")
//	        );
//	        onlineRadio.click();
	        Thread.sleep(2000);
//
//
//		     
		     // Click on "Create Conference" button
		        WebElement createConferenceBtns = driver.findElement(
		            By.xpath("//button[normalize-space()='Create Conference']")
		        );
		        createConferenceBtns.click();
		        Thread.sleep(3000);
//
//	        driver.quit();	  
		        Thread.sleep(3000);
		        
		        
		 	   
		        WebElement ticketsLink = wait.until(ExpectedConditions.elementToBeClickable(
		            By.xpath("//a[.//p[normalize-space()='Tickets']]")
		        ));
		        ticketsLink.click();
		        Thread.sleep(3000);
		        
		        WebElement createTicketHref = wait.until(ExpectedConditions.elementToBeClickable(
		        	    By.xpath("//a[contains(@href,'/tickets/new')]")
		        	));
		        	createTicketHref.click();
		        	// Wait a bit before interacting
		        	Thread.sleep(2000);

		        	// Locate the input field
		        	WebElement ticketNameInput = driver.findElement(By.xpath("//input[@name='name']"));

		        	// Clear any existing text
		        	ticketNameInput.clear();

		        	// Extra sleep so you can visually confirm
		        	Thread.sleep(1000);

		        	// Enter new value
		        	ticketNameInput.sendKeys("My Automation Ticket");

		        	// Sleep after typing (optional)
		        	Thread.sleep(2000);
		        	// Wait until "Create Ticket Type" button is clickable and click it
		        	WebElement createTicketBtn = wait.until(
		        	    ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Create Ticket Type']"))
		        	);
		        	createTicketBtn.click();
		        	
		        	
		        	Thread.sleep(3000);
		        	WebElement sessionsLink = wait.until(ExpectedConditions.elementToBeClickable(
		        	        By.xpath("//a[contains(@href,'/sessions')]//p[normalize-space()='Sessions']"))
		        	);

		        	// Click on Sessions
		        	sessionsLink.click();
		        	Thread.sleep(2000);
		        	WebElement createSessionBtn = wait.until(ExpectedConditions.elementToBeClickable(
		        	        By.xpath("//button[@type='button' and normalize-space()='Create Session']"))
		        	);

		        	// Small sleep (extra buffer so UI is stable)
		        	Thread.sleep(1000);

		        	// Click on Create Session
		        	createSessionBtn.click();
		        	
		        	
		        	
		        	   Thread.sleep(3000);
		   	        WebElement eventNameInputs = wait.until(ExpectedConditions.visibilityOfElementLocated(
		   	                By.xpath("//input[@placeholder='Give the event a name']")
		   	        ));

		   	       
		   	        Thread.sleep(2000);

		   	        eventNameInputs.click();
		   	        Thread.sleep(1000);
		   	        eventNameInputs.sendKeys("My Automation Conference Test Session");

		   	        
		   	        System.out.println("Entered Event Name: My Automation Test Session");

		   	        
		   	        Thread.sleep(2000);
		   	    
		   	    
		   	        
		   	        WebElement startDateTimes = wait.until(ExpectedConditions.visibilityOfElementLocated(
		   	                By.xpath("(//input[@placeholder='Enter date and time'])[1]")
		   	        ));
		   	        Thread.sleep(2000);
		   	        startDateTimes.sendKeys(Keys.CONTROL + "a"); // Select all
		   	        startDateTimes.sendKeys(Keys.DELETE);        // Delete existing
		   	        Thread.sleep(1000);
		   	        startDateTimes.sendKeys("Sep 10, 2025 10:00 AM");
		   	        System.out.println("Entered Start Date & Time");

		   	        // End Date & Time field
		   	        WebElement endDateTimes = wait.until(ExpectedConditions.visibilityOfElementLocated(
		   	                By.xpath("(//input[@placeholder='Enter date and time'])[2]")
		   	        ));
		   	        Thread.sleep(2000);
		   	        endDateTimes.sendKeys(Keys.CONTROL + "a"); // Select all
		   	        endDateTimes.sendKeys(Keys.DELETE);        // Delete existing
		   	        Thread.sleep(1000);
		   	        endDateTimes.sendKeys("Sep 10, 2025 12:00 PM");
		   	        System.out.println("Entered End Date & Time");

		   	        
		   	     // Close the datepicker first
		   	     // Close date picker by clicking outside
		   	        Thread.sleep(2000);

		   	        WebElement onlineRadios = driver.findElement(By.xpath("//label[.//p[normalize-space()='Online']]"));
		   	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", onlineRadios);
		   	        
		   	     Thread.sleep(3000);
		   	     
		   	
		   	  WebElement videoMeetRadio = wait.until(ExpectedConditions.elementToBeClickable(
		   	          By.xpath("//label[.//p[normalize-space()='Video Meet on Tradewing']]"))
		   	  );

		   	  // Small buffer sleep for UI animation
		   	  Thread.sleep(1000);

		   	  // Click the radio
		   	  videoMeetRadio.click();
		   	  
		   	 Thread.sleep(2000);

		   	     WebElement createSessionBtnss = wait.until(ExpectedConditions.elementToBeClickable(
		   	             By.xpath("//button[normalize-space()='Create Session']"))
		   	     );

		   	     // Small buffer sleep for UI animations
		   	     Thread.sleep(1000);

		   	     // Click the button
		   	     createSessionBtnss.click();
		   	     
		   	  Thread.sleep(4000);

		   	// Wait for "Back to My Automation Conference Test Event" link
		   	  WebElement backLink = wait.until(ExpectedConditions.elementToBeClickable(
		   	          By.xpath("//a[.//span[normalize-space()='Back to My Automation Conference Test Event']]"))
		   	  );

		   	  // Small buffer sleep for smooth click
		   	  Thread.sleep(1000);

		   	  // Click on it
		   	  backLink.click();
		   	Thread.sleep(2000);
		   	
		   	WebElement partnerLink = wait.until(ExpectedConditions.elementToBeClickable(
		   	        By.xpath("//a[.//p[normalize-space()='Partner']]"))
		   	);

		   	// Small sleep for smooth transition
		   	Thread.sleep(1000);

		   	// Click on Partner link
		   	partnerLink.click();
		   	
		   	Thread.sleep(2000);
		   	WebElement editBtn = wait.until(ExpectedConditions.elementToBeClickable(
		   	        By.xpath("//button[normalize-space()='Edit']"))
		   	);

		   	// Small sleep for safety
		   	Thread.sleep(1000);

		   	// Click Edit button
		   	editBtn.click();
			Thread.sleep(2000);
			
	
			WebElement addCompanyBtn = wait.until(ExpectedConditions.elementToBeClickable(
			    By.xpath("//button[.//span[text()='Add a company']]")
			));
			addCompanyBtn.click();
			Thread.sleep(2000);
			// 2. Select company
			WebElement companyOption = wait.until(ExpectedConditions.elementToBeClickable(
			    By.xpath("//p[text()='Aanant infra']")   // company option
			));
			companyOption.click();
			Thread.sleep(2000);

			// 3. Send ESC key to close dropdown
			Actions actions = new Actions(driver);
			actions.sendKeys(Keys.ESCAPE).perform();
			Thread.sleep(2000);
			
			// Wait until "Save Changes" button is clickable
			WebElement saveChangesBtn = wait.until(ExpectedConditions.elementToBeClickable(
			    By.xpath("//button[normalize-space()='Save Changes']")
			));

			// Small wait before clicking
			Thread.sleep(2000);

			// Click on Save Changes
			saveChangesBtn.click();
			
			Thread.sleep(2000);
			WebElement createBoothBtn = wait.until(ExpectedConditions.elementToBeClickable(
				    By.xpath("//button[normalize-space()='Create Booth']")
				));

				// Click the button
				createBoothBtn.click();
				Thread.sleep(2000);
				
				WebElement websiteInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
				        By.xpath("//input[@placeholder='www.website.com']")
				));

				// Extra small sleep for UI stability
				Thread.sleep(2000);

				// Clear & enter value
				websiteInput.clear();
				Thread.sleep(1000);
				websiteInput.sendKeys("https://www.mycompany.com");

				// Final short sleep
				Thread.sleep(1000);
				WebElement createBoothBtns = wait.until(ExpectedConditions.elementToBeClickable(
				        By.xpath("//button[text()='Create Booth']")
				));
				Thread.sleep(1500); // extra buffer
				createBoothBtns.click();
				Thread.sleep(8000); // pause after click
				
				WebElement backToEvent = wait.until(
				        ExpectedConditions.elementToBeClickable(By.xpath("//a[.//span[text()='Back to My Automation Conference Test Event']]"))
				);
				Thread.sleep(500); // small pause
				backToEvent.click();
				Thread.sleep(2000); // wait after navigation
				WebElement publishBtn = wait.until(
				        ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Publish']"))
				);
				Thread.sleep(1500); // small pause
				publishBtn.click();
				Thread.sleep(7000); // wait after publish action
				driver.quit();
				
				




		        	
	 
	 
	 }
	
	
	
	

}
