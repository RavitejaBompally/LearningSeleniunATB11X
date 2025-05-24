package com.thetestingacademy.ex_12_Exceptions;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium_39_Stale {
    @Test
    public void stale_element() {

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");

        WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));

        System.out.println(driver.getWindowHandle());

        driver.navigate().refresh();

        try {
            search.sendKeys("the testing academy"+ Keys.ENTER);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException");
        }

        System.out.println(driver.getWindowHandle());
        System.out.println("End of program");

    }
}
