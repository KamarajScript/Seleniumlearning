package com.Baseclass;

import org.openqa.selenium.WebDriver;

public class Util {

    public WebDriver driver;
    public void navigateUrl(String url, WebDriver driver) {
        driver.navigate().to(url);
    }

    public void close(WebDriver driver) {
        driver.close();
    }

    public void quit(WebDriver driver) {
        driver.quit();
    }

}
