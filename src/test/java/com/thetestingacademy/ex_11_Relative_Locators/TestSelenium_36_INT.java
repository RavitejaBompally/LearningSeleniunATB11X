package com.thetestingacademy.ex_11_Relative_Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class TestSelenium_36_INT {

    @Test
    public void interview() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");

        driver.switchTo().frame("result");

        driver.findElement(By.xpath("//form[@id='form']//button")).click();

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));

        WebElement error_msg = driver.findElement(with(By.tagName("small")).below(username));

        String errorText = error_msg.getText();
        Assert.assertEquals(errorText,"Username must be at least 3 characters");

    }

}
