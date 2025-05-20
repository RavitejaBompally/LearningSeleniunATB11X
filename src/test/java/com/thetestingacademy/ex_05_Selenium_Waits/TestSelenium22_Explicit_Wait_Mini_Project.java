package com.thetestingacademy.ex_05_Selenium_Waits;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium22_Explicit_Wait_Mini_Project {

    @Description("Verify invlaid, password and error message")
    @Owner("Ravi teja")
    @Test

    public void testVWOLogin() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/");
        System.out.println(driver.getTitle());


        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("admin@admin.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("12345");

        WebElement submit = driver.findElement(By.id("js-login-btn"));
        submit.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("js-notification-box-msg")));

        WebElement error = driver.findElement(By.className("notification-box-description"));
        Assert.assertEquals(error.getText(),"Your email, password, IP address or location did not match");

        driver.quit();
    }
}
