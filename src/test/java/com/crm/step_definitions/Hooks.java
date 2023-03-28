package com.crm.step_definitions;

import com.crm.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

@After
    public void tearDown(Scenario scenario) {


    if(scenario.isFailed()){ byte[] screenshot = ((TakesScreenshot)Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

    scenario.attach(screenshot,"image/png",scenario.getName());}


    Driver.getDriver().close();



}







}
