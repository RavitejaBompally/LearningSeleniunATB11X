package com.thetestingacademy.ex_12_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium_38_Noelementfound {

    @Test
    public void no_element_found () {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        try {
            driver.findElement(By.id("Ravi"));
        } catch (NoSuchElementException e) {
            System.out.println("Element not found");
        }
    }
}
