package com.thetestingacademy.ex_02Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {
    public static void main(String[] args) {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com");
    }
}
