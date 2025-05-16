package com.thetestingacademy.ex_02Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium09_ChangeDriver {

    @Test
    public void ChangeDriver() {
        WebDriver driver = new ChromeDriver();
        driver = new EdgeDriver();
    }
}
