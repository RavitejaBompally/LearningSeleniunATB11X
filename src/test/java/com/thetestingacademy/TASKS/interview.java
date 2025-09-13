package com.thetestingacademy.TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class interview {
    @Test
    public void techlist() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.techlistic.com/2017/02/automate-demo-web-table-with-selenium.html");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.xpath("//div[@dir='ltr']"));
        table.isDisplayed();

        WebElement burgcalif = driver.findElement(By.xpath("//span[text()='Clock Tower Hotel']/following::td[3]"));
        burgcalif.isDisplayed();


        driver.quit();


    }
}
