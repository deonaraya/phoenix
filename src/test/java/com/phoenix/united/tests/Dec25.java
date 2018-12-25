package com.phoenix.united.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dec25 {

    WebDriver driver ;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser){
        if (browser.equalsIgnoreCase("CHROME")) {
            System.setProperty("webdriver.chrome.driver","/Users/cnarayan/Documents/opia/united/src/test/resources/chromedriver");
            driver = new ChromeDriver();
        }
        else
        if(browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","/Users/cnarayan/Documents/opia/united/src/test/resources/geckodriver");
            driver = new FirefoxDriver();
        }
    }



    //figure out the priority thing
    @Test
    public void holi(){
        driver.get("https://www.myntra.com");
        System.out.println(driver.getTitle());
        driver.close();

    }

    @Test
    public void diwali(){
        driver.get("https://www.motorola.com");
        System.out.println(driver.getTitle());
        driver.close();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
