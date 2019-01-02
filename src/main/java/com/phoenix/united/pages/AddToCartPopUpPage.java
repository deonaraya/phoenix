package com.phoenix.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddToCartPopUpPage extends BasePage {

    @FindBy(xpath = "//i[@class='icon-ok']/parent::h2")
    private WebElement addToCartSuccesMessage ;

    @FindBy(xpath = "")
    private WebElement productName ;

    @FindBy(xpath = "")
    private WebElement productPrice ;

    @FindBy(xpath = "//a[@title='Proceed to checkout']")
    private WebElement proceedCheckOutButton ;

    @FindBy(xpath = "")
    private WebElement backToShoppingButton ;


    public AddToCartPopUpPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(addToCartSuccesMessage);
    }

    public String getSuccessMessage(){
        return addToCartSuccesMessage.getText();
    }

    public String getProductName(){
        return productName.getText();
    }

    public String getProductPrice(){
        return productPrice.getText();
    }


    public void proceedCheckout(){
        proceedCheckOutButton.click();
    }









}
