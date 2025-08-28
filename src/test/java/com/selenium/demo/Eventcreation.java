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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Eventcreation {
	
	
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
	        WebElement simpleEvent = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//a[@href='/admin/event/new']//p[contains(text(),'Create a Simple Event')]")
	        ));
	        simpleEvent.click();
	        System.out.println("Selected 'Create a Simple Event'");
	        Thread.sleep(3000);
	     // Wait for Event Name input field using placeholder
	        WebElement eventNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//input[@placeholder='Give the event a name']")
	        ));

	       
	        Thread.sleep(2000);

	        eventNameInput.click();
	        Thread.sleep(1000);
	        eventNameInput.sendKeys("My Automation Test Event");

	        
	        System.out.println("Entered Event Name: My Automation Test Event");

	        
	        Thread.sleep(2000);
	    
	        WebElement descriptionEditor = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[contains(@class,'public-DraftStyleDefault-block')]")
	        ));

	       
	        Thread.sleep(1000);

	       
	        descriptionEditor.click();
	        Thread.sleep(1000);

	       
	        descriptionEditor.sendKeys("This is an automated event description.");

	       
	        System.out.println("Entered event description");

	        
	        Thread.sleep(2000);
	     
	        WebElement startDateTime = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("(//input[@placeholder='Enter date and time'])[1]")
	        ));
	        Thread.sleep(2000);
	        startDateTime.sendKeys(Keys.CONTROL + "a"); // Select all
	        startDateTime.sendKeys(Keys.DELETE);        // Delete existing
	        Thread.sleep(1000);
	        startDateTime.sendKeys("Sep 15, 2025 10:00 AM");
	        System.out.println("Entered Start Date & Time");

	        // End Date & Time field
	        WebElement endDateTime = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("(//input[@placeholder='Enter date and time'])[2]")
	        ));
	        Thread.sleep(2000);
	        endDateTime.sendKeys(Keys.CONTROL + "a"); // Select all
	        endDateTime.sendKeys(Keys.DELETE);        // Delete existing
	        Thread.sleep(1000);
	        endDateTime.sendKeys("Sep 15, 2025 12:00 PM");
	        System.out.println("Entered End Date & Time");

	        Thread.sleep(2000);
	     // Click on Create Event button
	        WebElement createEventBtns= wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//button[contains(text(),'Create Event')]")
	        ));
	        Thread.sleep(2000);
	        createEventBtns.click();
	        System.out.println("Clicked on Create Event button");
	        Thread.sleep(2000);
	     // Click on Publish button
	        WebElement publishBtn = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//button[contains(text(),'Publish')]")
	        ));
	        Thread.sleep(2000);
	        publishBtn.click();
	        System.out.println("Clicked on Publish button");
	        
	        Thread.sleep(6000);
	        driver.quit();





	        


	        

	 
	 }
	
	

}
