package com.phoenix.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AthenticationPage {

    WebDriver driver ;

    @FindBy(id = "email_create")
    private WebElement registerTextField;

    @FindBy(id = "SubmitCreate")
    private WebElement registerButton;

    public AthenticationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void registerUser(String emailId){
        registerTextField.sendKeys(emailId);
        registerButton.click();
    }



}
