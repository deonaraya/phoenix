package com.phoenix.united.pages;

import com.sun.xml.internal.rngom.parse.host.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AuthenticationPage extends BasePage {

    @FindBy(xpath = "//h1[text()='Authentication']")
    private WebElement authText;

    @FindBy(id = "email_create")
    private WebElement registerTextField;

    @FindBy(id = "SubmitCreate")
    private WebElement registerButton;



    @FindBy(id = "email")
    private WebElement emailTextField ;

    @FindBy(id = "passwd")
    private WebElement passwordTextField ;

    @FindBy(id = "SubmitLogin")
    private WebElement loginButton;

    public AuthenticationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
        waitForWebElement(authText);
    }

    public void signIn(String uname , String pwd){
        emailTextField.sendKeys(uname);
        passwordTextField.sendKeys(pwd);
        loginButton.click();
    }

    public void registerUser(String emailId){
        registerTextField.sendKeys(emailId);
        registerButton.click();
    }



}
