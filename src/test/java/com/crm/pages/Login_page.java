package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {

    public Login_page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }


    @FindBy(name="USER_LOGIN")
    public  WebElement usernameButton;

    @FindBy(name="USER_PASSWORD")
    public  WebElement passwordButton ;

    @FindBy(id="USER_REMEMBER")
    public  WebElement rememberMeButton  ;

    @FindBy(className="login-btn")
    public WebElement  loginButton;

    @FindBy(xpath ="//div[.='Incorrect login or password']")
    public WebElement alertText;

    @FindBy(className ="login-link-forgot-pass")
    public  WebElement forgotPassword ;





}
