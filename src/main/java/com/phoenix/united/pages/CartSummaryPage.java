package com.phoenix.united.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartSummaryPage extends BasePage {

    @FindBy(id="cart_title")
    private WebElement cartSummaryPageLocator;

    @FindBy(xpath = "//p[@class='cart_navigation clearfix']//a[@title='Proceed to checkout']")
    private WebElement checkoutButton ;

    public CartSummaryPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(cartSummaryPageLocator);
    }

    public void proceedToCheckout(){
        checkoutButton.click();
    }
}
