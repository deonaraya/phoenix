package com.phoenix.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AddToCartPopUpPage {

    WebDriver driver;

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
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void verifyProductAdded(){
        Assert.assertEquals(addToCartSuccesMessage.getText(),"Product successfully added to your shopping cart");
    }

    public void proceedCheckout(){
        proceedCheckOutButton.click();
    }









}
