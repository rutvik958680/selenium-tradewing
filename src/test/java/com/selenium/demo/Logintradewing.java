package com.selenium.demo;



import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logintradewing {
	
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
	        WebElement addPersonBtn = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//button[normalize-space()='Add Person']")));
	        addPersonBtn.click();
	        Thread.sleep(2000);
	        WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//input[@placeholder='First Name']")));
	        firstName.sendKeys("John");
	        Thread.sleep(2000);
	        WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//input[@placeholder='Last Name']")));
	        lastName.sendKeys("Doe");
	        Thread.sleep(2000);
	        WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(
	        	    By.xpath("//input[@name='accountEmail']")
	        	));
	        	emailInput.sendKeys("RutvikshashsTest@example.com");
	        Thread.sleep(2000);
	     
	     // Target the button itself, not the span inside
	        WebElement roleDropdown = wait.until(ExpectedConditions.elementToBeClickable(
	            By.xpath("//button[@type='button' and .//span[normalize-space()='Regular User']]")
	        ));

	        // Scroll into view just in case
	        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", roleDropdown);

	        // Use JS click to bypass overlay interception
	        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", roleDropdown);
	        Thread.sleep(2000);
	        WebElement adminOption = wait.until(ExpectedConditions.visibilityOfElementLocated(
	            By.xpath("//div[@role='menu']//button[normalize-space()='Admin']")
	        ));

	        // 3️⃣ Click Admin option
	        adminOption.click();
	        Thread.sleep(2000);
	        WebElement addNonMemberBtn = wait.until(ExpectedConditions.elementToBeClickable(
	        	    By.xpath("//button[normalize-space()='Add as a Non-Member']")
	        	));
	        	addNonMemberBtn.click();
	        	 Thread.sleep(6000);
	        	// Wait for the 3-dot account actions menu button and click
	        	 WebElement accountActionsBtn = wait.until(ExpectedConditions.elementToBeClickable(
	        	     By.xpath("//button[@type='button' and @aria-label='account actions']")
	        	 ));
	        	 accountActionsBtn.click();
	        	 Thread.sleep(3000);
	        	 WebElement generateLinkBtn = wait.until(
	        			    ExpectedConditions.elementToBeClickable(By.xpath("//button[@role='menuitem' and .//span[normalize-space()='Generate Password Reset Link']]"))
	        			);

	        			// Click the button
	        			generateLinkBtn.click();
	        			 Thread.sleep(3000);
	        			// Click copy button
	        			 WebElement copyButton = wait.until(ExpectedConditions.elementToBeClickable(
	        			     By.xpath("//div[contains(@class,'chakra-input__right-addon') and text()='Copy']")));
	        			 copyButton.click();
	        			 Thread.sleep(2000);

	        			 // Get the reset link
	        			 WebElement linkField = wait.until(ExpectedConditions.visibilityOfElementLocated(
	        			     By.cssSelector("input.chakra-input")));
	        			 String resetLink = linkField.getAttribute("value");
	        			 System.out.println("Reset link: " + resetLink);

	        			 // Open link in new tab
	        			 ((JavascriptExecutor) driver).executeScript("window.open('" + resetLink + "','_blank');");
	        			 Thread.sleep(2000);

	        			 // Switch to the new tab
	        			 ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
	        			 driver.switchTo().window(tabs.get(tabs.size() - 1));

	        			 // Now wait for password field
	        			 WebElement passwordFields = wait.until(ExpectedConditions.visibilityOfElementLocated(
	        			     By.cssSelector("input[type='password'][name='password']")));

	        			 // Enter new password
	        			 passwordFields.sendKeys("123");

	        			 // Click submit
	        			 WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(
	        			     By.xpath("//button[normalize-space()='Submit']")));
	        			 submitButton.click();



	        	
	        
	  }
	
	

}
