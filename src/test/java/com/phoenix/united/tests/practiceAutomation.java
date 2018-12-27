package com.phoenix.united.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class practiceAutomation extends BaseTest {





    @Test
    public void getProductNames(){
        String dummy = "//ul[@id='homefeatured']/li[5]//h5[@itemprop='name']/a";
        WebElement priceItem = driver.findElement(By.xpath(dummy));

        List<WebElement> prodList = driver.findElements(By.xpath("//ul[@id='homefeatured']/li//h5[@itemprop='name']/a")) ;
        for (WebElement elem: prodList) {
            System.out.println(elem.getText());
        }
    }

    @Test
    public void getProductPrices(){
        List<WebElement> priceList = driver.findElements(By.xpath("//ul[@id='homefeatured']/li//div[@class='right-block']//span[@itemprop='price']")) ;
        for (WebElement elem: priceList) {
            System.out.println(elem.getText());

        }
    }

    @Test
    public


}
