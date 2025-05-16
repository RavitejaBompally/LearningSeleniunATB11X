package com.thetestingacademy.ex_02Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium11_NOHTTP {

    @Test
    public void NoHTTP() {
        WebDriver driver = new EdgeDriver();
        //driver.get("bing.com"); -- HTTPS is important
        driver.get("https://bing.com");
        driver.quit();
    }
}
