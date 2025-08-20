package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.silentOutput", "true");
		java.util.logging.Logger.getLogger("org.openqa.selenium").setLevel(java.util.logging.Level.SEVERE);

	
	        // ✅ Path of ChromeDriver (your setup: C:\Selenium\drivers\chromedriver.exe)
	        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\drivers\\chromedriver.exe");

	        // Start Chrome browser
	        WebDriver driver = new ChromeDriver();

	        // Open Google
	        driver.get("https://www.google.com");

	        // Print the title of the page
	        System.out.println("Page title is: " + driver.getTitle());

	        // Close the browser
	       
	    
	}
	}


