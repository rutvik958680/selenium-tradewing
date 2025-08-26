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


public class GroupCreation {
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
	     // Wait until the "Community" button is clickable
	        WebElement communityBtn = wait.until(
	            ExpectedConditions.elementToBeClickable(
	                By.xpath("//a[contains(@href,'/admin/community/moderation') and contains(.,'Community')]")
	            )
	        );

	        // Click using normal click
	        communityBtn.click();

	        // Alternative (in case normal click fails)
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].click();", communityBtn);
	        
	        Thread.sleep(2000);
	     // Wait until the "Groups" button is clickable
	        WebElement groupsBtn = wait.until(
	            ExpectedConditions.elementToBeClickable(
	                By.xpath("//a[contains(@href,'/admin/community/groups') and text()='Groups']")
	            )
	        );

	        // Click normally
	        groupsBtn.click();

	        // Fallback with JavaScript if needed
	        JavascriptExecutor jss = (JavascriptExecutor) driver;
	        jss.executeScript("arguments[0].click();", groupsBtn);
	        Thread.sleep(2000);
	        WebElement addGroupBtn = wait.until(
	        	    ExpectedConditions.elementToBeClickable(
	        	        By.xpath("//a[@href='/admin/community/groups/new']/button[contains(text(),'Add Group')]")
	        	    )
	        	);

	        	// Normal click
	        	addGroupBtn.click();
	        	   Thread.sleep(2000);
	        	   WebElement groupName = wait.until(
	        			    ExpectedConditions.visibilityOfElementLocated(
	        			        By.xpath("//input[@name='name']")
	        			    )
	        			);
	        			groupName.clear();
	        			Thread.sleep(700);
	        			groupName.sendKeys("Test Group for Automation one");
	        			   Thread.sleep(2000);
	        			   WebElement groupOrderDropdown = wait.until(
	        					    ExpectedConditions.visibilityOfElementLocated(
	        					        By.xpath("//label[contains(text(),'Group Order')]/following::select[1]")
	        					    )
	        					);

	        					Select groupOrder = new Select(groupOrderDropdown);
	        					groupOrder.selectByVisibleText("3");

	        					System.out.println("Selected Group Order: " 
	        					    + groupOrder.getFirstSelectedOption().getText());
	        					
	        					Thread.sleep(2000);
	        					// Locate the hidden file input (type='file')
//	        					WebElement uploadInput = wait.until(
//	        					    ExpectedConditions.presenceOfElementLocated(
//	        					        By.xpath("//input[@type='file']")
//	        					    )
//	        					);
//
//	        					// Send file path directly
//	        					uploadInput.sendKeys("C:\\Users\\HP\\Downloads\\a.jpg");
//
//	        					System.out.println("Image uploaded successfully!");
	        					Thread.sleep(3000);
	        					// ✅ Click checkbox: Contacts with selected People Attributes
	        					WebElement checkbox = wait.until(
	        					    ExpectedConditions.elementToBeClickable(
	        					        By.xpath("//label[contains(.,'Contacts with selected People Attributes')]")
	        					    )
	        					);
	        					checkbox.click();

	        					System.out.println("✅ Checkbox selected: Contacts with selected People Attributes");
	        					
	        					Thread.sleep(3000);
	        					// ✅ Click on "Select People Attribute" dropdown
	        					
	        						Thread.sleep(2000);
	        						WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(
	        							    By.xpath("//button[contains(.,'Select People Attribute')]")));
	        							js.executeScript("arguments[0].click();", dropdown);
	        							System.out.println("Dropdown opened");
	        							Thread.sleep(1000);
	        							WebElement firstNameBtn = wait.until(ExpectedConditions.elementToBeClickable(
	        								    By.xpath("//button[.//span[text()='First Name']]")));
	        								js.executeScript("arguments[0].click();", firstNameBtn);
	        								System.out.println("First Name selected");
	        								Thread.sleep(1000);
	        								// ✅ 4. Select Last Name
	        								WebElement lastNameBtn = wait.until(ExpectedConditions.elementToBeClickable(
	        								    By.xpath("//button[.//span[text()='Last Name']]")));
	        								js.executeScript("arguments[0].click();", lastNameBtn);
	        								System.out.println("Last Name selected");
	        								Thread.sleep(1500);
	        								// Close dropdown by pressing ESC
	        								WebElement dropdownInput = driver.findElement(By.xpath("//input[@placeholder='Search People Attribute']"));
	        								dropdownInput.sendKeys(Keys.ESCAPE);
	        								System.out.println("Dropdown closed with ESC");
	        								Thread.sleep(1500);
	        								// Enter First Name
	        								WebElement firstName = wait.until(ExpectedConditions.visibilityOfElementLocated(
	        								        By.xpath("//input[@placeholder='Enter First Name']")));
	        								firstName.clear();
	        								Thread.sleep(500);
	        								firstName.sendKeys("Rutvik");
//	        								System.out.println("First Name entered");

	        								// Enter Last Name
	        								WebElement lastName = wait.until(ExpectedConditions.visibilityOfElementLocated(
	        								        By.xpath("//input[@placeholder='Enter Last Name']")));
	        								lastName.clear();
	        								Thread.sleep(500);
	        								lastName.sendKeys("Shah");
	        								Thread.sleep(2000);
//	        								System.out.println("Last Name entered");
	        								WebElement addButton = wait.until(ExpectedConditions.elementToBeClickable(
	        								        By.xpath("//button[contains(text(),'Add')]")));
	        								addButton.click();
	        								System.out.println("Add button clicked");
	        								Thread.sleep(5000);
	        								WebElement subgroupsLink = wait.until(ExpectedConditions.elementToBeClickable(
	        								        By.xpath("//a[contains(@href,'/subgroups')]//div[contains(text(),'Subgroups')]")));
	        								subgroupsLink.click();
	        								System.out.println("Clicked on Subgroups link");
	        								Thread.sleep(3000);
	        								// Click on "Add Subgroup" button
	        								WebElement addSubgroupBtn = wait.until(ExpectedConditions.elementToBeClickable(
	        								        By.xpath("//button[.//span[contains(text(),'Add Subgroup')]]")));
	        								addSubgroupBtn.click();
	        								System.out.println("Clicked on Add Subgroup button");
	        								
	        								Thread.sleep(2000);
	        								// Click on "Create a New Subgroup"
	        								WebElement createSubgroupBtn = wait.until(ExpectedConditions.elementToBeClickable(
	        								        By.xpath("//button[contains(text(),'Create a New Subgroup')]")));
	        								createSubgroupBtn.click();
	        								System.out.println("Clicked on Create a New Subgroup");
	        								Thread.sleep(2000);
	        								   WebElement groupNames = wait.until(
	        					        			    ExpectedConditions.visibilityOfElementLocated(
	        					        			        By.xpath("//input[@name='name']")
	        					        			    )
	        					        			);
	        					        			groupNames.clear();
	        					        			Thread.sleep(700);
	        					        			groupNames.sendKeys("Test sub Group for Automation one");
	        					        			   Thread.sleep(2000);
	        					        			   WebElement groupOrderDropdowns = wait.until(
	        					        					    ExpectedConditions.visibilityOfElementLocated(
	        					        					        By.xpath("//label[contains(text(),'Group Order')]/following::select[1]")
	        					        					    )
	        					        					);

	        					        					Select groupOrders = new Select(groupOrderDropdowns);
	        					        					groupOrders.selectByVisibleText("1");

	        					        					System.out.println("Selected Group Order: " 
	        					        					    + groupOrders.getFirstSelectedOption().getText());
	        					        					
	        					        					Thread.sleep(2000);
	        					        					// Locate the hidden file input (type='file')
//	        					        					WebElement uploadInput = wait.until(
//	        					        					    ExpectedConditions.presenceOfElementLocated(
//	        					        					        By.xpath("//input[@type='file']")
//	        					        					    )
//	        					        					);
	        				//
//	        					        					// Send file path directly
//	        					        					uploadInput.sendKeys("C:\\Users\\HP\\Downloads\\a.jpg");
	        				//
//	        					        					System.out.println("Image uploaded successfully!");
	        					        					Thread.sleep(3000);
	        					        					System.out.println("Last Name entered");
	        		        								WebElement addButtons = wait.until(ExpectedConditions.elementToBeClickable(
	        		        								        By.xpath("//button[contains(text(),'Add')]")));
	        		        								addButtons.click();
	        		        								System.out.println("Add button clicked");
	        								
	        					


	
	 
	 }
	 

}
