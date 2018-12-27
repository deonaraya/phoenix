package com.phoenix.united.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseTest {

    WebDriver driver ;

    @Parameters("browser")
    @BeforeClass
    public void setUp(String browser){
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver","/Users/cnarayan/Documents/opia/united/src/test/resources/chromedriver");
            driver = new ChromeDriver();
        }
        else
        if(browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","/Users/cnarayan/Documents/opia/united/src/test/resources/geckodriver");
            driver = new FirefoxDriver();
        }

        driver.get("http://automationpractice.com/index.php");
        driver.manage().window().maximize();
    }


    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
