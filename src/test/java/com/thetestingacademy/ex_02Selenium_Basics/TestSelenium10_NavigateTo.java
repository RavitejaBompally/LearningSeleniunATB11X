package com.thetestingacademy.ex_02Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium10_NavigateTo {

    @Test
    public void Navigate() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        //use Navigation Commands
        //driver.get("url") --->Navigate to URL

        //Use Navigation methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
    }
}
