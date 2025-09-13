package com.thetestingacademy.TASKS;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class amazon {

    @Description("Amazon ecommerce")
    @Owner("Ravi Teja")
    @Test

    public void amazon() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");

        WebElement search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
        search.sendKeys("iphone");

        WebElement suggestions = driver.findElement(By.xpath("//div[@class='left-pane-results-container']"));
        suggestions.isDisplayed();

        WebElement suggestionclick = driver.findElement(By.id("sac-suggestion-row-9-cell-1"));
        suggestionclick.click();
    }
}
