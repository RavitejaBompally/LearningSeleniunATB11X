package com.thetestingacademy.TASKS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class alerts {
    @Test
    public void alert() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/alerts.php");

        WebElement alert = driver.findElement(By.xpath("//div[@class='col-md-8 col-lg-8 col-xl-8']"));
        alert.isDisplayed();

        WebElement alerbox = driver.findElement(By.xpath("//label[contains(text(),'Click Button to see alert')]//following::button[text()='Alert']"));
        alerbox.click();

        Alert alert1 = driver.switchTo().alert();
        System.out.println("Alert says: " + alert1.getText());
        alert1.accept();
    }

}
