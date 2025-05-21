package com.thetestingacademy.TASKS;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.time.Duration;

public class Katalon_Full_Flow {

    private static final Logger log = LoggerFactory.getLogger(Katalon_Full_Flow.class);

    @Test
    @Description("Full Flow of Katalon")
    @Owner("Ravi Teja")
    @Severity(SeverityLevel.NORMAL)

    public void full_flow () throws InterruptedException {

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com");
        driver.manage().window().maximize();

        WebElement makeappointment = driver.findElement(By.id("btn-make-appointment"));
        makeappointment.click();

        Thread.sleep(3000);

        WebElement username = driver.findElement(By.xpath("//input[@id='txt-username']"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.xpath("//input[@id='txt-password']"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement login = driver.findElement(By.xpath("//button[@id='btn-login']"));
        login.click();

        Thread.sleep(3000);

        WebElement dropdown = driver.findElement(By.xpath("//select[@id='combo_facility']"));
        Select select = new Select(dropdown);
        select.selectByContainsVisibleText("Seoul CURA Healthcare Center");

        WebElement checkbox = driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']"));
        checkbox.click();

        WebElement radio = driver.findElement(By.xpath("//input[@id='radio_program_medicaid']"));
        radio.click();

        WebElement datepicker = driver.findElement(By.xpath("//span[@class='glyphicon glyphicon-calendar']"));
        datepicker.click();

        WebElement selectdate = driver.findElement(By.xpath("//td[@class='day' and text()='25']"));
        selectdate.click();

        WebElement comments = driver.findElement(By.xpath("//textarea[@name='comment']"));
        comments.sendKeys("Booking an appointment to consult doctor");

        WebElement bookappointment = driver.findElement(By.xpath("//button[@class='btn btn-default']"));
        bookappointment.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='col-xs-12 text-center']")));

        WebElement homepage = driver.findElement(By.xpath("//div[@class='col-xs-12 text-center']"));
        homepage.getText();

        driver.quit();

    }

}
