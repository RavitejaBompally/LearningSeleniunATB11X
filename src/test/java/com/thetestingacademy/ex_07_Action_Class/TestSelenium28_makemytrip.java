package com.thetestingacademy.ex_07_Action_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium28_makemytrip {

    @Test
    public void test_action(){
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.makemytrip.com");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy='closeModal']")));

        WebElement close = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        close.click();

        WebElement From_City = driver.findElement(By.xpath("//input[@id='fromCity']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(From_City).click().sendKeys("HYD").build().perform();

        try {
            List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

            for (WebElement e:  list_auto_complete){
                if(e.getText().contains("HYD")){
                    e.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            System.out.println("Ignore this");
        }

    }
}
