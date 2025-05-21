package com.thetestingacademy.ex_08_Fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium31_Fileupload {

    @Test
    public void fileupload() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://awesomeqa.com/selenium/upload.html");
        driver.manage().window().maximize();

        WebElement uploadfile = driver.findElement(By.id("fileToUpload"));

        String working_dir = System.getProperty("user.dir");
        // /Users/promode/IdeaProjects/LearnSeleniumATB11x


        String path_file = working_dir+"/src/test/java/com/thetestingacademy/Data.txt";

        uploadfile.sendKeys(path_file);
        driver.findElement(By.name("submit")).click();
    }
}
