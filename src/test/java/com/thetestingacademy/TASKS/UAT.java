package com.thetestingacademy.TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class UAT {

    @Test
    public void login() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://reportsorg.kwixee.co.in/");
        driver.manage().window().maximize();
        driver.getTitle();
        System.out.println("Hello, Please Sign In here");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='container body-content']")));

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("raviregression@quixy.com");

        WebElement cont_btn = driver.findElement(By.xpath("//input[@type='button']"));
        cont_btn.click();

        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']")));

        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
        password.sendKeys("Quixy@1234");

        WebElement sigin = driver.findElement(By.id("login"));
        sigin.click();

       Thread.sleep(15000);

        WebElement live = driver.findElement(By.xpath("//span[contains(text(),'Live')]"));
        live.isDisplayed();
        live.click();

        Thread.sleep(3000);

        WebElement dev = driver.findElement(By.xpath("//span[contains(text(),'Dev')]"));
        dev.isDisplayed();
        dev.click();

//       WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(60));
//       wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button//i[@class='fal fa-ham-menu']")));

        Thread.sleep(5000);

       WebElement adminmenu = driver.findElement(By.xpath("//button[contains(@class,'admin')]"));
       adminmenu.click();

       Thread.sleep(2000);

       WebElement apps = driver.findElement(By.xpath("//div[text()=' Apps ']"));
       apps.click();















    }
}
