package com.thetestingacademy.TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Popup_modal {

    @Test

    public void popup () {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/modal-dialogs");

        WebElement largemodal = driver.findElement(By.id("showLargeModal"));
        largemodal.click();

        WebElement popupview = driver.findElement(By.xpath("//div[@class='modal-content']"));
        popupview.isDisplayed();

        driver.quit();
    }
}
