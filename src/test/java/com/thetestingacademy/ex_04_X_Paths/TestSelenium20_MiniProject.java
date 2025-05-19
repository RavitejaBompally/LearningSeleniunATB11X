package com.thetestingacademy.ex_04_X_Paths;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium20_MiniProject {

    @Description("Login Page for app.vwo.com")
    @Owner("Ravi Teja")
    @Severity(SeverityLevel.CRITICAL)
    @Test

    public void xpath_freetrail() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://vwo.com/free-trial/");
        driver.manage().window().maximize();

        WebElement busines_email = driver.findElement(By.xpath("//input[@id='page-v1-step1-email']"));
        busines_email.sendKeys("admin@admin.com");

        WebElement checkbox = driver.findElement(By.xpath("//input[@id='page-free-trial-step1-cu-gdpr-consent-checkbox']"));
        checkbox.click();

        List<WebElement> create_button = driver.findElements(By.xpath("//button[@data-qa='page-su-submit']"));
        create_button.get(0).click();

        Thread.sleep(1000);

        driver.quit();
    }
}
