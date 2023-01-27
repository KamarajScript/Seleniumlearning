package Testcase;

import com.Baseclass.DriverInitiate;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleTest extends DriverInitiate {

    @BeforeTest
    public void browserCall() {
        driver = getDriver("Chrome");
    }

    @Test
    public void urlCall() {
        navigateUrl("https://www.google.com", driver);
    }

    @AfterTest
    public void browserClose() {
        close(driver);
    }
}
