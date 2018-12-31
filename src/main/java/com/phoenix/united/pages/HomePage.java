package com.phoenix.united.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    WebDriver driver;

//    String dummy = "//ul[@id='homefeatured']/li[5]//h5[@itemprop='name']/a";
//    WebElement priceItem = driver.findElement(By.xpath(dummy));

    @FindBy(xpath = "//ul[@id='homefeatured']/li[1]//h5[@itemprop='name']/a")
    private WebElement productName1 ;

    @FindBy(xpath = "//ul[@id='homefeatured']/li[5]//div[@class='right-block']//span[@itemprop='price']")
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


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    public void getProductName(){
        System.out.println(productName1.getText());
    }

    public void getProductPrice(){
        System.out.println(productPrice1.getText());
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


    public void addToCart(){

        Actions actions = new Actions(driver);
        actions.moveToElement(productContainer1).build().perform();
        addToCart1.click();
    }



}