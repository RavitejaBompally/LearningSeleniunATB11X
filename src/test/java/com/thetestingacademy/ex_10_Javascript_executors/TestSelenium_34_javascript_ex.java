package com.thetestingacademy.ex_10_Javascript_executors;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class TestSelenium_34_javascript_ex {

    @Test
    public void javascript() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window location = 'https://www.google.com'");

        driver.get("https://selectorshub.com/xpath-practice-page/");

        WebElement div_to_scroll = driver.findElement(By.xpath("//div[@id='userName']"));


        js.executeScript("window.scrollBy(0, 500);");


        String url = js.executeScript("return document.URL;").toString();
        String title = js.executeScript("return document.title;").toString();

        System.out.println(url);
        System.out.println(title);
    }
}
