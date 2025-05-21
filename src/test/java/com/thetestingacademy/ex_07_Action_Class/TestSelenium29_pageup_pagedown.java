package com.thetestingacademy.ex_07_Action_Class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium29_pageup_pagedown {

    @Test
    public void pageup_pagedown() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://thetestingacademy.com");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_UP).build().perform();
    }
}
