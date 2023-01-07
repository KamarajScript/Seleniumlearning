package Testcase;

import org.openqa.selenium.WindowType;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Baseclass.DriverInitiate;

public class BrowserQuit extends DriverInitiate {

    @BeforeTest
    public void browserCall() {
        driver = getDriver("Chrome");
    }

    @Test
    public void Urlnavigate() {
        navigateUrl("https://www.yahoo.com", driver);
        driver.switchTo().newWindow(WindowType.TAB);
    }

    @AfterTest
    public void browserQuit() {
        quit(driver);
    }
}
