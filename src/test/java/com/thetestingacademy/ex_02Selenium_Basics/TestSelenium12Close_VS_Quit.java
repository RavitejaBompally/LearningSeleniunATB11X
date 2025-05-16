package com.thetestingacademy.ex_02Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium12Close_VS_Quit {
    @Test
    public void Close_Quit() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        Thread.sleep(5000);
        driver.close();

        // Close - will close the current tab, not the session (not the all tabs)
        // session id != null

        Thread.sleep(5000);
        driver.quit();
        // It will close all the tabs. - session id == null
    }
}
