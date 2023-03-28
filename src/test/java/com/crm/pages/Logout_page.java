package com.crm.pages;

import com.crm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout_page {

    public Logout_page(){

        PageFactory.initElements(Driver.getDriver(),this);

    }



    @FindBy(id="user-name")
    public  WebElement username;

    @FindBy(xpath = "//*[@id=\"popup-window-content-menu-popup-user-menu\"]/div/div/a[3]")
    public  WebElement logoutButton;

    @FindBy(className = "menu-item-link-text")
    public  WebElement ActiveStreamButton;





}
