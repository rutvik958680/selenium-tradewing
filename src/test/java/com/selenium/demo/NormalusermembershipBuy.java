package com.selenium.demo;



import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NormalusermembershipBuy {
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
        emailField.sendKeys("aletresze@gmail.com");
        Thread.sleep(2000);

        // Clear the password field before entering new text
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.cssSelector("input[type='password'][name='password']")));
        passwordField.sendKeys("123");
        Thread.sleep(2000);

        WebElement signInButton1 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@type='submit' and normalize-space()='Sign In']")));
        signInButton1.click();
        Thread.sleep(5000);

        WebElement accountMenuBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@aria-label='account menu']")));
        accountMenuBtn.click();
        Thread.sleep(2000);

        WebElement adminSiteOption = driver.findElement(
                By.xpath("//button[.//span[normalize-space()='Membership']]"));
        adminSiteOption.click();
        Thread.sleep(2000);

        WebElement membershipActionsBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@aria-label='membership actions']")));
        membershipActionsBtn.click();
        Thread.sleep(2000);

        WebElement addMembershipBtn = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[.//span[text()='Add a Membership']]")));
        addMembershipBtn.click();
        Thread.sleep(5000);

        WebElement radioInput = driver.findElement(
                By.xpath("//p[text()='tests auto Individual two']/ancestor::label//span[contains(@class,'chakra-radio__control')]"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", radioInput);
        Thread.sleep(500); // allow time to scroll
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", radioInput);
        Thread.sleep(2000);

        WebElement nextButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[normalize-space()='Choose Membership']")));
        nextButton.click();
        Thread.sleep(4000);

        WebElement SubmitB = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[normalize-space()='Submit']")));
        SubmitB.click();
        Thread.sleep(4000);

        WebElement accountMenuBtns = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@aria-label='account menu']")));
        accountMenuBtns.click();
        Thread.sleep(2000);

        WebElement adminSiteOptions = driver.findElement(
                By.xpath("//button[.//span[normalize-space()='Membership']]"));
        adminSiteOptions.click();
        Thread.sleep(2000);
    }
}
									
											
