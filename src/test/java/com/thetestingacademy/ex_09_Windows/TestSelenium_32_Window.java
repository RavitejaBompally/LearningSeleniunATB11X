package com.thetestingacademy.ex_09_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TestSelenium_32_Window {

    @Test
    public void window_handle() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        WebElement click_link = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        click_link.click();

        Set<String> windowHandles = driver.getWindowHandles();
        System.out.println(windowHandles);

        for (String handle: windowHandles){
            driver.switchTo().window(handle);
            if (driver.getPageSource().contains("New window")) {
                System.out.println("Test case passed");
            }
            driver.switchTo().window(parent);
            }
        }
    }
