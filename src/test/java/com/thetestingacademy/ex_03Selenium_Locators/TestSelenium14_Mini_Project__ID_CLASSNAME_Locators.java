package com.thetestingacademy.ex_03Selenium_Locators;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium14_Mini_Project__ID_CLASSNAME_Locators {

    @Test
    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Ravi Teja")
    @Severity(SeverityLevel.BLOCKER)

    public void test_vwo_login_invalid_login() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://app.vwo.com");

        //<input type="email" class="text-input W(100%)" name="username" id="login-username" data-qa="hocewoqisi">

        WebElement email_input_box = driver.findElement(By.id("login-username"));
        email_input_box.sendKeys("admin@admin.com");

        WebElement password_input_box = driver.findElement(By.name("password"));
        password_input_box.sendKeys("12345");

        WebElement submit_button = driver.findElement(By.id("js-login-btn"));
        submit_button.click();

        Thread.sleep(3000);

        WebElement error_message = driver.findElement(By.className("notification-box-description"));
        System.out.println(error_message.getText());

        Assert.assertEquals(error_message.getText(), "Your email, password, IP address or location did not match");



        driver.quit();

    }
}
