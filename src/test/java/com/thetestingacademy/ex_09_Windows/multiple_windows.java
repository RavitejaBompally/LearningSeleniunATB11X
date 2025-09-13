package com.thetestingacademy.ex_09_Windows;

import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.Set;

public class multiple_windows {
    @Owner("Ravi Teja")
    @Test

    public void windows() throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-qa='zuhufahufe']")));

        String parent = driver.getWindowHandle();
        System.out.println(parent);

        List<WebElement> listheatmaps =  driver.findElements(By.xpath("//img[@data-qa='danawobuqa']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(listheatmaps.get(1)).build().perform();

        Thread.sleep(1500);

        Set<String> allhandles = driver.getWindowHandles();
        System.out.println(allhandles);

        for (String handle : allhandles) {

            if (!handle.equals(parent)){
                driver.switchTo().window(handle);
                driver.switchTo().frame("heatmap-iframe");
                WebElement clickbutton = driver.findElement(By.xpath("//div[@data-qa='liqokuxuba']"));
                clickbutton.click();
            }
        }


    }
}
