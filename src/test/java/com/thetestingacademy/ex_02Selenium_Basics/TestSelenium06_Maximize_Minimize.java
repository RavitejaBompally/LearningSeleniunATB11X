package com.thetestingacademy.ex_02Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium06_Maximize_Minimize {
    @Test
    public void test_max_min() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        //driver.manage().window().maximize();
        driver.manage().window().minimize();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.quit();
    }
}
