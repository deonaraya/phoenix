package com.phoenix.united.tests;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Dec25_2 extends BaseTest {


    //figure out the priority thing
    @Test
    public void moto(){
        driver.get("https://www.sony.com");
        System.out.println(driver.getTitle());
//        driver.close();

    }

    @Test
    public void testB(){
        driver.get("https://www.flipkart.com");
        System.out.println(driver.getTitle());
//        driver.close();
    }




}
