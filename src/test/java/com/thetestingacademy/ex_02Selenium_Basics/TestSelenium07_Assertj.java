package com.thetestingacademy.ex_02Selenium_Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestSelenium07_Assertj {

    @Test
    public void Assertj() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://google.com");

        Assert.assertEquals(driver.getCurrentUrl(),"https://google.com");

        //Assertj Validation
        assertThat(driver.getCurrentUrl()).isNotBlank().isNotNull().isEqualTo("https://google.com");

        driver.quit();
    }
}
