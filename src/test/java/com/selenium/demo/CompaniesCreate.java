package com.selenium.demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CompaniesCreate {
	
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
     // Wait for the Companies link and click
        WebElement companiesLink = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[@href='/admin/companies' and contains(@class,'chakra-button')]")
                )
        );

        companiesLink.click();
        System.out.println("Clicked on Companies link");

        // Optional pause if page load is heavy
        Thread.sleep(2000);
     // Wait for Add Company button and click
        WebElement addCompanyBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[normalize-space()='Add Company']")
                )
        );

        addCompanyBtn.click();
        System.out.println("Clicked on Add Company button");

        // Optional pause if form loads
        Thread.sleep(2000);
     // Wait for Company Name input field
        WebElement companyNameInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@placeholder='Company name']")
                )
        );
        
        Thread.sleep(2000);

        // Enter company name
        companyNameInput.sendKeys("My Test two Company");
        System.out.println("Entered Company Name");

        // Optional pause
        Thread.sleep(3000);
        
        WebElement addCompanyBtns = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[normalize-space()='Add Company']")
                )
        );

        // Click Add Company button
        addCompanyBtns.click();
        System.out.println("Clicked on Add Company button");

        // Optional pause
        Thread.sleep(4000);

     // Wait for People link
        WebElement peopleLink = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//a[contains(@href,'/admin/companies')]/div[normalize-space()='People']")
                )
        );

        // Click on People
        peopleLink.click();
        System.out.println("Navigated to People page");

        // Optional pause
        Thread.sleep(2000);
     // Wait for Add User button inside People page
        WebElement addUserBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[@aria-label='add user to company roster']")
                )
        );

        // Click on Add User button
        addUserBtn.click();
        System.out.println("Clicked on Add User button");

        // Optional pause
        Thread.sleep(3000);
     // Wait for "Search People to Add" button
        WebElement searchPeopleBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(.,'Search People to Add')]")
                )
        );

        // Click on the button
        searchPeopleBtn.click();
        System.out.println("Clicked on 'Search People to Add' button");

        // Optional pause
        Thread.sleep(2000);
     // Wait for "Add a New User" button to be clickable
        WebElement addNewUserBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button[contains(.,'Add a New User')]")
                )
        );

        // Click the button
        addNewUserBtn.click();
        System.out.println("Clicked on 'Add a New User' button");

        // Optional pause
        Thread.sleep(2000);
        WebElement firstNameInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("firstName"))
        );
        firstNameInput.clear();
        Thread.sleep(1000);
        firstNameInput.sendKeys("John");

        // Last Name
        WebElement lastNameInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("lastName"))
        );
        lastNameInput.clear();
        Thread.sleep(1000);
        lastNameInput.sendKeys("Doe");

        // Email
        WebElement emailInput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("email"))
        );
        emailInput.clear();
        Thread.sleep(1000);
        emailInput.sendKeys("johnabcabcabc.doe@example.com");

        System.out.println("Filled First Name, Last Name, and Email fields");
        Thread.sleep(2000); // optional pause
     // Wait for Add New User button and click
        WebElement addUserBtns = wait.until(
                ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[normalize-space()='Add New User']")
                )
        );
        addUserBtns.click();

        System.out.println("✅ New User added successfully!");
        Thread.sleep(3000); // optional pause for stability
     // Wait for Save Changes button and click
        WebElement saveBtn = wait.until(
                ExpectedConditions.elementToBeClickable(
                    By.xpath("//button[normalize-space()='Save Changes']")
                )
        );
        saveBtn.click();

        System.out.println("✅ Changes saved successfully!");
        Thread.sleep(2000); // optional pause for stability




        
	}
	
	
	
	
	
	

}
