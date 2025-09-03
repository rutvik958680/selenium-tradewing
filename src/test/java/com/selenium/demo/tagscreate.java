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


public class tagscreate {
	
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
	        WebElement communityBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(
	                        By.xpath("//a[@href='/admin/community/moderation']//span[normalize-space()='Community'] | //a[@href='/admin/community/moderation']")
	                )
	        );

	        // Click on it
	        communityBtn.click();
	        System.out.println("Clicked on Community button");

	        // Optional pause to see the result
	        Thread.sleep(2000);
	     // Wait until the "Tags" button is clickable
	        WebElement tagsBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(
	                        By.xpath("//a[@href='/admin/community/tags' and normalize-space()='Tags']")
	                )
	        );

	        // Click on it
	        tagsBtn.click();
	        System.out.println("Clicked on Tags button");

	        // Optional pause
	        Thread.sleep(2000);
	     // Wait for the "Add Tag" button to be clickable
	        WebElement addTagBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(
	                        By.xpath("//button[normalize-space()='Add Tag']")
	                )
	        );

	        // Click the button
	        addTagBtn.click();
	        System.out.println("Clicked on Add Tag button");

	        // Optional pause
	        Thread.sleep(2000);
	     // Wait for the Tag name input field
	        WebElement tagNameInput = wait.until(
	                ExpectedConditions.visibilityOfElementLocated(
	                        By.xpath("//input[@placeholder='Tag name']")
	                )
	        );

	        // Clear any pre-filled value (if any)
	        tagNameInput.clear();
	        Thread.sleep(1000);
	        // Enter the tag name
	        tagNameInput.sendKeys("MyAutomationTag");
	        System.out.println("Entered tag name: MyAutomationTag");

	        // Optional pause
	        Thread.sleep(2000);
	        
	        WebElement submitBtn = wait.until(
	                ExpectedConditions.elementToBeClickable(
	                        By.xpath("//button[normalize-space()='Submit']")
	                )
	        );

	        submitBtn.click();
	        Thread.sleep(2000);


	 
	 
	 }
	

}
