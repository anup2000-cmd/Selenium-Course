package com.qascript;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstTest {


    @Test
    public void OpenBrowser()  {
        System.out.println("Hiiiii-----");
       //WebDriver driver;
      //  System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
     //   ChromeOptions options = new ChromeOptions();
      //  options.addArguments("disable-gpu");
       WebDriver driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        System.out.println("Title of the page is: " + driver.getTitle());
        //Assert.assertTrue("Page title is not correct",driver.getTitle().equals("Google"));
    }


}


