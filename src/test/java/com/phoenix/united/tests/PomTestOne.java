package com.phoenix.united.tests;

import com.phoenix.united.pages.AddToCartPopUpPage;
import com.phoenix.united.pages.AuthenticationPage;
import com.phoenix.united.pages.CartSummaryPage;
import com.phoenix.united.pages.HomePage;
import com.phoenix.united.utils.ExcelUtils;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class PomTestOne extends BaseTest {

    public static XSSFWorkbook workbook;
    public static XSSFSheet worksheet;
    public static DataFormatter formatter= new DataFormatter();

    @DataProvider(name = "readExcel")
    public static Object[][] ReadVariant() throws IOException {
        FileInputStream fileInputStream = new FileInputStream("/Users/cnarayan/Documents/opia/united/src/test/resources/MOCK_DATA.xlsx"); //Excel sheet file location get mentioned here
        workbook = new XSSFWorkbook(fileInputStream); //get my workbook
        worksheet = workbook.getSheet("data");// get my sheet from workbook
        XSSFRow Row = worksheet.getRow(0);     //get my Row which start from 0

        int RowNum = worksheet.getPhysicalNumberOfRows();// count my number of Rows
        int ColNum = Row.getLastCellNum(); // get last ColNum

        Object Data[][] = new Object[RowNum - 1][ColNum]; // pass my  count data in array

        for (int i = 0; i < RowNum - 1; i++) //Loop work for Rows
        {
            XSSFRow row = worksheet.getRow(i + 1);

            for (int j = 0; j < ColNum; j++) //Loop work for colNum
            {
                if (row == null)
                    Data[i][j] = "";
                else {
                    XSSFCell cell = row.getCell(j);
                    if (cell == null)
                        Data[i][j] = ""; //if it get Null value it pass no data
                    else {
                        String value = formatter.formatCellValue(cell);
                        Data[i][j] = value; //This formatter get my all values as string i.e integer, float all type data value
                    }
                }
            }
        }

        return Data;
    }

        @DataProvider(name = "mora")
        public Object[][] passDataToLogin(){
            return new Object[][]{{"deo1","pwd1"},{"deo2","pwd2"},{"deo4","pwd3"}};
        }

        @Test(dataProvider = "readExcel", enabled = false)
        public void login(String uname,String pwd){
            HomePage homePage = new HomePage(driver);
            homePage.navToSIgnIn().signIn(uname,pwd);

//            AuthenticationPage authenticationPage = new AuthenticationPage(driver);
//            authenticationPage.signIn(uname,pwd);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


        @Test
        public void methodChans(){
        HomePage homePage = new HomePage(driver);
        homePage.addToCart().proceedCheckout().proceedToCheckout().signIn("sdasdas@tedf.com","pwd");
        }


        @Test(enabled = false)
        public void test31Dec () {
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
            Assert.assertEquals(addToCartPopUpPage.getSuccessMessage(), "Product successfully added to your shopping cart");

            String nameOnPopUp = addToCartPopUpPage.getProductName();
            String priceOnPopUp = addToCartPopUpPage.getProductPrice();

            Assert.assertEquals(nameOnHomePage, nameOnPopUp);
            Assert.assertEquals(priceOnHomePage, priceOnPopUp);

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

            AuthenticationPage authenticationPage = new AuthenticationPage(driver);
            authenticationPage.registerUser("test@dsfsfsfs.com");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

