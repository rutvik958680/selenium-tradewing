package com.selenium.demo;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Corporatemembershippaidcreate {

	
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
	        Thread.sleep(2000);
	        WebElement membershipTypes = wait.until(ExpectedConditions.elementToBeClickable(
	        	    By.xpath("//a[@href='/admin/membership/types' and contains(@class,'chakra-button')]")
	        	));
	        	membershipTypes.click();
	        	Thread.sleep(2000);
	        	WebElement addMembershipType = wait.until(ExpectedConditions.elementToBeClickable(
	        		    By.xpath("//button[.//span[normalize-space(text())='Add Membership Type']]")
	        		));
	        		addMembershipType.click();
	        		Thread.sleep(4000);
	        		// Locate Corporate Membership by its text
	        		WebElement corporateMembership = wait.until(
	        		    ExpectedConditions.visibilityOfElementLocated(
	        		        By.xpath("//p[normalize-space()='Corporate Membership']")
	        		    )
	        		);

	        		// Click if it's clickable (or use for assertion)
	        		corporateMembership.click();
	        			Thread.sleep(2000);
	        			WebElement membershipName = wait.until(
	        				    ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='name']"))
	        				);

	        				membershipName.click();               // focus the field
	        				membershipName.sendKeys(Keys.chord(Keys.CONTROL, "a")); // select all
	        				membershipName.sendKeys(Keys.DELETE); // delete old value
	        				Thread.sleep(500);                     // small wait for React
	        				membershipName.sendKeys("Test Corporate Membership for new Dragon two Paid");

	        				Thread.sleep(2000);
	        				WebElement seatsInput = wait.until(
	        					    ExpectedConditions.elementToBeClickable(By.name("numberOfSeats"))
	        					);
	        					seatsInput.clear();
	        					seatsInput.sendKeys("10");   // put any number you need
	        					
	        					Thread.sleep(2000);
	        					Thread.sleep(2000);
		        				WebElement monthsInput = wait.until(ExpectedConditions.elementToBeClickable(
		        					    By.name("validityMonths")
		        					));
		        					monthsInput.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		        					Thread.sleep(500);
		        					monthsInput.sendKeys("12"); // new value
		        				
		        					Thread.sleep(2000);
		        					// Membership Price
		        					WebElement membershipPrice = wait.until(ExpectedConditions.elementToBeClickable(
		        					    By.name("membershipPrice")
		        					));
		        					membershipPrice.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		        					membershipPrice.sendKeys("2");   // New Membership Price

		        					// Renewal Price
		        					WebElement renewalPrice = wait.until(ExpectedConditions.elementToBeClickable(
		        					    By.name("renewalPrice")
		        					));
		        					renewalPrice.sendKeys(Keys.chord(Keys.CONTROL, "a"), Keys.DELETE);
		        					renewalPrice.sendKeys("3");   // New Renewal Price
		        					Thread.sleep(3000);
		        					WebElement createBtn = wait.until(ExpectedConditions.elementToBeClickable(
	        							    By.xpath("//button[normalize-space()='Create']")
	        							));
	        							createBtn.click();
	        							Thread.sleep(6000);
	        							driver.quit();
	 }
}
