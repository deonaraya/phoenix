package com.phoenix.united.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Dec25 extends BaseTest {

    //figure out the priority thing
    @Test
    public void holi(){
        driver.get("https://www.myntra.com");
        System.out.println(driver.getTitle());
//        driver.close();
    }

    @Test
    public void diwali(){
        driver.get("https://www.motorola.com");
        System.out.println(driver.getTitle());
//        driver.close();
    }




}
