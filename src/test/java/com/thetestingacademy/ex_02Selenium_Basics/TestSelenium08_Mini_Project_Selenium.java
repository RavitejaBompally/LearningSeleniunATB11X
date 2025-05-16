package com.thetestingacademy.ex_02Selenium_Basics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium08_Mini_Project_Selenium {

    @Description("Open the URL")
    @Test
    public void test_Selenium() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        driver.manage().window().maximize();

        if (driver.getPageSource().contains("CURA Healthcare Service")) {
            System.out.println("Test Case Passed");
            Assert.assertTrue(true);
        }
        else {
            Assert.fail("CURA Healthcare Service is not visible");
            System.out.println("Test Case Failed");
        }

        driver.quit();
    }

}
