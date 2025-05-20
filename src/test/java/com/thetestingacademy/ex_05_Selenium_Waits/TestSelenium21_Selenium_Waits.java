package com.thetestingacademy.ex_05_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestSelenium21_Selenium_Waits {

    @Description("Verify the Prices")
    @Owner("Ravi teja")
    @Test

    public void verify_print() {

        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://app.vwo.com");


    }
}
