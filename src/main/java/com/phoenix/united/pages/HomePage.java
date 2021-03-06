package com.phoenix.united.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage extends BasePage {


    @FindBy(className = "search_query")
    private WebElement searchTextField ;

//    @FindBy(xpath = "//input[name='search_query']")
//    private WebElement searchTextField ;


    @FindBy(className = "button-search")
    private WebElement searchButton ;

//    @FindBy(xpath = "//button[@name='submit_search']")
//    private WebElement searchButton ;


//    String dummy = "//ul[@id='homefeatured']/li[5]//h5[@itemprop='name']/a";
//    WebElement priceItem = driver.findElement(By.xpath(dummy));

    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]//h5[@itemprop='name']/a")
    private WebElement productName1 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]//div[@class='right-block']//span[@itemprop='price']")
    private WebElement productPrice1 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li//h5[@itemprop='name']/a")
    private List<WebElement> productNames ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li//div[@class='right-block']//span[@itemprop='price']")
    private List<WebElement> productPrices ;

//    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]//div[@class='button-container']/a/span[text()='Add to cart']")
//    private WebElement addToCart1 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]//a[@title='Add to cart']")
    private WebElement addToCart1 ;


    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]")
    private WebElement productContainer1 ;


    @FindBy(className = "login")
    private WebElement loginLink;


    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(loginLink);
    }


    public AuthenticationPage navToSIgnIn(){
        loginLink.click();
        return new AuthenticationPage(driver);
    }

    public String getProductName(){
         return  productName1.getText();
    }

    public String getProductPrice(){
        return productPrice1.getText();
    }

    public void getProductList(){
        for (WebElement name: productNames) {
            System.out.println(name.getText());
        }
    }

    public void getPriceList(){
        for (WebElement price: productPrices) {
            System.out.println(price.getText());
        }
    }

    public AddToCartPopUpPage addToCart(){
        Actions actions = new Actions(driver);
        actions.moveToElement(productContainer1).build().perform();

        WebDriverWait wait = new WebDriverWait(driver,1);
        wait.until(ExpectedConditions.visibilityOf(addToCart1));

//        if add to cart is not visible yet
        addToCart1.click();
        return new AddToCartPopUpPage(driver);
    }


    public void searchforProduct(String productName){
        searchTextField.sendKeys(productName);
        searchButton.click();
    }

}