package com.thetestingacademy.ex_11_Relative_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestSelenium_35_Relative_Loc {

    @Test
    public void Relative_Loc() {
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/practice.html");

        WebElement span = driver.findElement(By.xpath("//span[text()='Years of Experience']"));
        driver.findElement((with(By.id("exp-1")).toRightOf(span))).click();
    }
}
