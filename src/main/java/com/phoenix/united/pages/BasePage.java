package com.phoenix.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void waitForWebElement(WebElement element){
        WebDriverWait wait = new WebDriverWait(driver,2);
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
