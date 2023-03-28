package com.crm.step_definitions;

import com.crm.pages.Login_page;
import com.crm.pages.Logout_page;
import com.crm.utilities.ConfigurationReader;
import com.crm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class logout_step_definitions {

    Logout_page homePage = new Logout_page();
    Login_page loginPage = new Login_page();

   //------------------------------------------------------AC1

    @Given("user is on profile page")
    public void user_is_on_profile_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.usernameButton.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.passwordButton.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginButton.click();

    }
    @When("user clicks user menu")
    public void user_clicks_user_menu() {

       homePage.username.click();

    }
    @When("user clicks log out button")
    public void user_clicks_log_out_button() {

        homePage.logoutButton.click();

    }
    @Then("user go back to login page")
    public void user_go_back_to_login_page() {

        Assert.assertEquals("not back to login page", "Authorization",Driver.getDriver().getTitle());
    }


    // -----------------------------------------------------------AC 2

    @When("users clicks user menu")
    public void users_clicks_user_menu() {

       homePage.username.click();

    }

    @When("user click step back button")
    public void user_click_step_back_button() {

        Driver.getDriver().navigate().back();

    }

    @Then("user is cannot go to profile page")
    public void user_is_cannot_go_to_profile_page() {

        Assert.assertEquals("not back to home page", "Authorization",Driver.getDriver().getTitle());

    }

//-----------------------------------------AC 3

    @When("user open new tab with home page url")
    public void user_open_new_tab_with_home_page_url() {

        System.out.println("???");

    }

    @When("user close the open tab\\(s)")
    public void user_close_the_open_tab_s() {

        Driver.getDriver().close();

    }

    @When("user open home page url")
    public void user_open_home_page_url() {

        Driver.getDriver().get(ConfigurationReader.getProperty("homepage"));

    }

    @Then("user can not go to home page")
    public void user_can_not_go_to_home_page() {

        Assert.assertEquals("not back to home page", "Authorization",Driver.getDriver().getTitle());

    }




}
