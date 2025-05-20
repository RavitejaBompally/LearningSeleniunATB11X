package com.thetestingacademy.ex_06_Radio_Checkbox;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium24_Radio_CheckBox {

    @Test

    public void checkbox_radio() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();

        WebElement radio = driver.findElement(By.id("sex-1"));
        radio.click();

        WebElement checkbox = driver.findElement(By.id("profession-0"));
        checkbox.click();

        driver.quit();
    }
}
