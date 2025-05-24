package com.thetestingacademy.TASKS;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Expresso_CRM {

    @Description("Expresso CRM Login")
    @Owner("Ravi Teja")
    @Severity(SeverityLevel.CRITICAL)
    @Test

    public void expresso_crm() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.us.espocrm.com/");
        System.out.println(driver.getTitle());

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='btn-login']"))).click();

        Thread.sleep(5000);

        WebElement leads = driver.findElement(By.xpath("//li[@data-name='Lead']"));
        leads.click();

        Thread.sleep(2000);

        WebElement createlead = driver.findElement(By.xpath("//a[@data-action='create']"));
        createlead.click();

        Thread.sleep(5000);

        WebElement table_view = driver.findElement(By.id("main"));
        table_view.isDisplayed();

        WebElement table_body = driver.findElement(By.xpath("//div[contains(@class, 'panel-body-form')]"));
        table_body.isDisplayed();

        Thread.sleep(3000);

        WebElement dropdown = driver.findElement(By.xpath("//div[@class='col-sm-3 col-xs-3']//input[@type='text'][@autocomplete='new-password']"));
        dropdown.isDisplayed();
        dropdown.click();

        WebElement select = driver.findElement(By.xpath("//div[text()='Mr.']"));
        select.isDisplayed();
        select.click();

        WebElement firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        firstname.sendKeys("Bompally Ravi");

        WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
        lastname.sendKeys("Teja");

        WebElement email = driver.findElement(By.xpath("//input[@class='form-control email-address']"));
        email.sendKeys("bompallyraviteja@gmail.com");

        WebElement phonenumber = driver.findElement(By.xpath("//div[text()='Mobile']"));
        phonenumber.isDisplayed();

        WebElement phonenumber_enter = driver.findElement(By.xpath("//input[@autocomplete='espo-phoneNumber']"));
        phonenumber_enter.sendKeys("8919352821");

        WebElement AccountName = driver.findElement(By.xpath("//label[@data-name='accountName']"));
        AccountName.isDisplayed();

        WebElement AccountName_value = driver.findElement(By.xpath("//div[@class='field']//input[@autocomplete='espo-accountName']"));
        AccountName_value.sendKeys("SBI");

        WebElement save = driver.findElement(By.xpath("//button[@data-name='save']"));
        save.click();

        Thread.sleep(3000);

        WebElement Leads_click_link = driver.findElement(By.xpath("//a[@data-action='navigateToRoot']"));
        Leads_click_link.click();

        Thread.sleep(2000);

        WebElement search_displayed_header = driver.findElement(By.xpath("//div[@class='search-container']"));
        search_displayed_header.isDisplayed();

        WebElement search = driver.findElement(By.xpath("//input[@class='form-control text-filter']"));
        search.sendKeys("Bompally Ravi Teja");

        WebElement search_icon_click = driver.findElement(By.xpath("//span[@class='fas fa-search']"));
        search_icon_click.click();

        driver.quit();


    }
}
