package com.phoenix.united.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Dec24 {

    WebDriver driver ;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver","/Users/cnarayan/Documents/opia/united/src/test/resources/chromedriver");
        driver = new ChromeDriver();
    }



    //figure out the priority thing
    @Test
    public void xmas(){
        driver.get("https://www.adobe.com");
        System.out.println(driver.getTitle());
        driver.close();

    }

    @Test
    public void testB(){
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
        driver.close();
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
