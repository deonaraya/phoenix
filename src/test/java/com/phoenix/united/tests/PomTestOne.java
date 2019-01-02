package com.phoenix.united.tests;

import com.phoenix.united.pages.AddToCartPopUpPage;
import com.phoenix.united.pages.AthenticationPage;
import com.phoenix.united.pages.CartSummaryPage;
import com.phoenix.united.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.applet.AppletThreadGroup;

import java.net.Authenticator;

public class PomTestOne extends BaseTest {


    @Test
    public void test31Dec(){
        HomePage darshil = new HomePage(driver);
//        darshil.getPriceList();
//        darshil.getProductList();
//
//        darshil.getProductName();
//        darshil.getProductPrice();


        darshil.addToCart();

        String nameOnHomePage = darshil.getProductName();
        String priceOnHomePage = darshil.getProductPrice();

//        darshil.searchforProduct("Jeans");


        AddToCartPopUpPage addToCartPopUpPage = new AddToCartPopUpPage(driver);
        Assert.assertEquals(addToCartPopUpPage.getSuccessMessage(),"Product successfully added to your shopping cart");

        String nameOnPopUp = addToCartPopUpPage.getProductName();
        String priceOnPopUp = addToCartPopUpPage.getProductPrice();

        Assert.assertEquals(nameOnHomePage,nameOnPopUp);
        Assert.assertEquals(priceOnHomePage,priceOnPopUp);

//        addToCartPopUpPage.verifyProductAdded();
        addToCartPopUpPage.proceedCheckout();

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        CartSummaryPage cartSummaryPage = new CartSummaryPage(driver);
        cartSummaryPage.proceedToCheckout();

//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        AthenticationPage athenticationPage = new AthenticationPage(driver);
        athenticationPage.registerUser("test@dsfsfsfs.com");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
