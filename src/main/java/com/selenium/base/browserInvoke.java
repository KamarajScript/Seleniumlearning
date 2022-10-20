package com.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class browserInvoke {

    public  WebDriver driver;

    public WebDriver browserinvoke(String browser) {
        switch (browser) {
            case "Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "Firefox":
                 WebDriverManager.firefoxdriver().setup();
                 driver = new FirefoxDriver();
                 break;
        }
         return driver;
    }


    public  void closeDriver() {
        driver.quit();
    }

}
