package com.thetestingacademy.TASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

public class new_window {
    @Test
    public void newwindow() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");

        String mainWindow = driver.getWindowHandle();

        WebElement window = driver.findElement(By.xpath("//div[@class='col-md-8 col-lg-8 col-xl-8']"));
        window.isDisplayed();

        WebElement newwindow = driver.findElement(By.xpath("//button[(text()='New Window')]"));
        newwindow.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[@class='text-center']")));


        Set<String> allWindows = driver.getWindowHandles();

        for(String handle : allWindows) {
            if (!handle.equals(mainWindow)) {
                driver.switchTo().window(handle);
                System.out.println("Switched to new window: " + driver.getTitle());

                break;

            }
        }
    }
}
