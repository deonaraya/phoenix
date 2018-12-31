package com.phoenix.united.tests;

import com.phoenix.united.pages.HomePage;
import org.testng.annotations.Test;

public class PomTestOne extends BaseTest {


    @Test
    public void test31Dec(){
        HomePage darshil = new HomePage(driver);
        darshil.getPriceList();
        darshil.getProductList();

        darshil.getProductName();
        darshil.getProductPrice();


        darshil.addToCart();


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
