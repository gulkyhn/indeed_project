package com.crm.step_definitions;

import com.crm.pages.Login_page;
import com.crm.pages.Logout_page;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class login_step_definitions {

    Login_page loginPage = new Login_page();
    Logout_page homepage = new Logout_page();



    @Given("user is on login page")
    public void user_is_on_login_page() {
        Driver.getDriver().get("https://qa.azulcrm.com/");
    }

    //------------------------------> AC1


    @When("the user enter the valid {string} username")
    public void the_user_enter_the_valid_username(String string) {

        loginPage.usernameButton.sendKeys(string);

    }
    @When("user enter the  valid {string} password")
    public void user_enter_the_valid_password(String string) {

        loginPage.passwordButton.sendKeys(string);

    }
    @When("user clicks the login button")
    public void user_clicks_the_login_button() {

        loginPage.loginButton.click();

    }
    @Then("user arrives to home page")
    public void user_arrives_to_home_page() {

        homepage.ActiveStreamButton.isDisplayed();

    }

    @Then("Then user can see {string} in profile menu")
    public void then_user_can_see_in_profile_menu(String string) {

      String actual = homepage.username.getText();
        Assert.assertEquals("usernames not matched", actual,string);

    }

    //---------------------------------------------- AC 2

    @When("The user enters {string} username")
    public void the_user_enters_username(String string) {
        loginPage.usernameButton.sendKeys(string);

    }

    @When("user enters {string} password")
    public void user_enters_password(String string) {

        loginPage.passwordButton.sendKeys(string);
    }

    @Then("user should see {string} message")
    public void user_should_see_message(String string) {

     Assert.assertTrue("alert text not displayed", loginPage.alertText.isDisplayed());

    }

    //-------------------------------------------------------------  AC 3

    @When("the user enter the valid or empty {string} username")
    public void the_user_enter_the_valid_or_empty_username(String string) {

        loginPage.usernameButton.sendKeys(string);

    }

    @When("user enter the  valid or empty {string} password")
    public void user_enter_the_valid_or_empty_password(String string) {

        loginPage.passwordButton.sendKeys(string);
    }

    @Then("user should see {string}")
    public void user_should_see(String string) {

        Assert.assertEquals("please fill this out not displayed", string, loginPage.alertText.getText());

    }


    //----------------------------------------------------------------  AC 4


    @When("user clicks the forgot your password button")
    public void user_clicks_the_forgot_your_password_button() {

        loginPage.forgotPassword.click();

    }

    @Then("user in get password page")
    public void user_in_get_password_page() {

        Assert.assertEquals("get password title not verified","Get Password",Driver.getDriver().getTitle());

    }

    //-----------------------------------------------------------------  AC 5

    @When("remember me button exist and user can click")
    public void remember_me_button_exist_and_user_can_click() {

        Assert.assertTrue("remember button not exist", loginPage.rememberMeButton.isDisplayed());
        loginPage.rememberMeButton.click();
    }

    @Then("remember me button is clickable")
    public void remember_me_button_is_clickable() {

        Assert.assertTrue("remember me button is clickable", loginPage.rememberMeButton.isSelected());

    }

    //--------------------------------------------------------------  AC 6

    @When("user click the password button")
    public void user_click_the_password_button() {

        loginPage.passwordButton.click();

    }

    @Then("user sees password in bullet sign")
    public void user_sees_password_in_bullet_sign() {

        Assert.assertEquals("password", loginPage.passwordButton.getAttribute("type"));
    }




    //---------------------------------------------------------------   AC 7

    @When("user enter valid cridentials")
    public void user_enter_valid_cridentials() {

      loginPage.usernameButton.sendKeys("hr99@cybertekschool.com");
        loginPage.passwordButton.sendKeys("UserUser");

    }

    @When("user get enter key")
    public void user_get_enter_key() {

        loginPage.passwordButton.sendKeys(Keys.ENTER);

    }

    @Then("user should get profile menu")
    public void user_should_get_profile_menu() {

        Assert.assertTrue(homepage.ActiveStreamButton.isDisplayed());

    }










}







