package com.thetestingacademy.TASKS;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TextBox {

    @Description("TextBox")
    @Owner("Raviteja")
    @Severity(SeverityLevel.NORMAL)
    @Test

    public void textbox() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
        System.out.println(driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[@class='text-center']")));

        WebElement form = driver.findElement(By.xpath("//form[@id='TextForm']"));
        form.isDisplayed();

        WebElement textbox = driver.findElement(By.xpath("//label[contains(text(),'Full Name')]//following::input[@name='fullname']"));
        textbox.sendKeys("Raviteja Bompally");

        WebElement email = driver.findElement(By.xpath("//label[text()='Email :']//following::input[@id='email']"));
        email.sendKeys("raviteja@gmail.com");

        WebElement address = driver.findElement(By.xpath("//label[text()='Current Address :']//following::textarea[@name='address']"));
        address.sendKeys("1-15-235/3, Balajinagar");

        WebElement password = driver.findElement(By.xpath("//label[text()='Password']//following::input[@name='password']"));
        password.sendKeys("ravi@123");

        WebElement submit_btn = driver.findElement(By.xpath("//input[@type='submit']"));
        submit_btn.click();


    }
}
