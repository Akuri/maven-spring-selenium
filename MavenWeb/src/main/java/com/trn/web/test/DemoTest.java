package com.trn.web.test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoTest {
    static WebDriver driver; 
    static Wait<WebDriver> wait; 

	@Test
	public void testSeleniumJenkins() {
		System.out.println("I am now executing selenium test case");
		
		//WebDriver driver = new InternetExplorerDriver();
		//driver.get("www.facebook.com");
		//System.out.println(driver.getTitle());
		//driver.quit();
		//fail("Not yet implemented");
		System.setProperty("webdriver.ie.driver","C:\\Users\\Akuri\\Downloads\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("www.google.com");
		System.out.println(driver.getTitle());
		System.out.println("Selenium test is now completed");
		
	}
	
	@Test
	public void testSeleniumFireFox(){

		System.out.println("I am now executing selenium FireFox test case");
        driver = new FirefoxDriver(); 
        wait = new WebDriverWait(driver, 30); 
        driver.get("http://www.google.com/"); 

        boolean result; 

        try { 

            //result = firstPageContainsQAANet(); 

        } catch(Exception e) { 

            e.printStackTrace(); 

            result = false; 

        } finally { 

            driver.close(); 
            System.out.println("Selenium FireFox test is now completed");

        } 

//        System.out.println("Test " + (result? "passed." : "failed.")); 
//        if (!result) { 
//            System.exit(1); 
//        } 

	}

}
