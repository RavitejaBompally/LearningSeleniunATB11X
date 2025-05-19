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

public class TestSelenium19_MiniProject {

    @Description("Login Page")
    @Owner("Ravi Teja")
    @Severity(SeverityLevel.CRITICAL)
    @Test

    public void Login_page() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("abc");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("12345");

        WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
        login.click();

    }
}
