package com.thetestingacademy.ex_09_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Set;


public class TestSelenium_33_vwo_project {
    @Test
    public void vwoproject() throws InterruptedException {
        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/test/ab/13/heatmaps/1?token=eyJhY2NvdW50X2lkIjo2NjY0MDAsImV4cGVyaW1lbnRfaWQiOjEzLCJjcmVhdGVkX29uIjoxNjcxMjA1MDUwLCJ0eXBlIjoiY2FtcGFpZ24iLCJ2ZXJzaW9uIjoxLCJoYXNoIjoiY2IwNzBiYTc5MDM1MDI2N2QxNTM5MTBhZDE1MGU1YTUiLCJzY29wZSI6IiIsImZybiI6ZmFsc2V9&isHttpsOnly=1");
        driver.manage().window().maximize();

        Thread.sleep(5000);

        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        List<WebElement> list_heatmaps = driver.findElements(By.xpath("//div[@data-qa=\"yedexafobi\"]"));
        Actions actions = new Actions(driver);

        actions.moveToElement(list_heatmaps.get(1)).click().build().perform();
        Thread.sleep(15000);

        Set<String> allHandles = driver.getWindowHandles();
        System.out.println(allHandles);

        for (String handle : allHandles){

            if(!handle.equals(parentWindowHandle)){
                driver.switchTo().window(handle);
                driver.switchTo().frame("heatmap-iframe");
                WebElement click_map_button = driver.findElement(By.xpath("//span[@data-qa=\"refoyekife\"]"));
                click_map_button.click();

            }
        }




    }
}
