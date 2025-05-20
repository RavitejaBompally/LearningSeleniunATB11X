package com.thetestingacademy.ex_03Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium17_Youtube {

    @Description("Open Youtube")
    @Owner("Ravi teja")
    @Test

    public void youtube() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://youtube.com");

        WebElement shorts = driver.findElement(By.linkText("Shorts"));
        shorts.click();



    }
}


