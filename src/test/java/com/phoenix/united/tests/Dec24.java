package com.phoenix.united.tests;
import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Dec24 extends BaseTest {

    //figure out the priority thing
    @Test
    public void xmas(){
        driver.get("https://www.adobe.com");
        System.out.println(driver.getTitle());
//        driver.close();

    }

    @Test
    public void testB(){
        driver.get("https://www.amazon.com");
        System.out.println(driver.getTitle());
//        driver.close();
    }

}
