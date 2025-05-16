package com.thetestingacademy.ex_02Selenium_Basics;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium03 {


    //SearchContext Driver = new ChromeDriver();


    //1.Do you want to run on Chrome

   // ChromeDriver driver = new ChromeDriver();


    //2. Do you want to run on Chrome and then Edge

    WebDriver driver = new ChromeDriver();
   // driver = new EdgeDriver();
   // driver = new FirefoxDriver(); ------- 97% will use this
}
