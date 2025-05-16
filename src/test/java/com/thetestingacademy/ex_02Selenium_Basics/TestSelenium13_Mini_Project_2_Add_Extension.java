package com.thetestingacademy.ex_02Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.io.File;

public class TestSelenium13_Mini_Project_2_Add_Extension {
    @Description("Option Class")
    @Test
    public void test01_Selenium() throws Exception {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--window-size=1920,1080");
        edgeOptions.addExtensions(new File("src/test/java/com/thetestingacademy/ex_02Selenium_Basics/AdBlock-—-block-ads-across-the-web-Chrome-Web-Store.crx"));

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://www.youtube.com/watch?v=BwTSxsAqlEc");
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}