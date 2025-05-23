package com.thetestingacademy.TASKS;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class applitools_task {

    @Description("Calculate total amount of money spent")
    @Owner("Ravi Teja")
    @Severity(SeverityLevel.NORMAL)
    @Test

    public void cal_total_amount() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.applitools.com");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@id='username']"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("Password@123");

        WebElement sigin = driver.findElement(By.xpath("//a[@id='log-in']"));
        sigin.click();

        Thread.sleep(2000);

        String first_part = "//table[@class='table table-padded']/tbody/tr[";
        String second_part = "]/td[";
        String third_part = "]";

        int row = driver.findElements(By.xpath("//table[@class='table table-padded']/tbody/tr")).size();
        int col = driver.findElements(By.xpath("//table[@class='table table-padded']/tbody/tr[1]/td")).size();

        double amount;
        double total = 0.0;

        for (int i = 1; i<=row; i++){
            for (int j = 1; j<=col; j++){
                if (j==5){
                    String dynamic_path = first_part + i + second_part + j + third_part;
                    String amountText = driver.findElement(By.xpath(dynamic_path)).getText();
                    amountText = amountText.replace(" ","").replace(",", "")
                            .replace("$", "").replace("USD","").trim();
                    // System.out.println(amountText);
                    amount=Double.parseDouble(amountText);
                    total += amount;

                }

            }

        }
        System.out.println(total);
        Assert.assertEquals(total,1996.22,"Assertion verified");
    }
}
