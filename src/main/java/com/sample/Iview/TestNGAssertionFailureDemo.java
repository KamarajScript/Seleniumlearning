package com.sample.Iview;

import com.Baseclass.DriverInitiate;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAssertionFailureDemo extends DriverInitiate {

   // public WebDriver driver;

    @BeforeTest
    public void browserCall() {
         driver = getDriver("Chrome");
    }

    @Test
    public void AssertionFailure(){
         navigateUrl("https://www.gmail.com",driver);
         String actualTitle = "Google";
        String expectedTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle,"Incorrect page title");
    }

    @AfterTest
    public void browserQuit() {
        quit(driver);
    }
}
