package Testcase;

import com.Baseclass.DriverInitiate;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class popupLogin extends DriverInitiate {

    @BeforeTest
    public void browserCall() {
        driver = getDriver("Chrome");
    }

    @Test
    public void browserLogin() {
        driver.navigate().to("https://www.w3docs.com/tools/code-editor/12095");
        driver.switchTo().frame("result");
        driver.findElement(By.xpath("//button[@class='openButton']")).click();
        driver.findElement(By.xpath("//form[@class='formContainer']//input[@id='email']")).sendKeys("Kamaraj");
        driver.findElement(By.xpath("//form[@class='formContainer']//input[@id='psw']")).sendKeys("Password");
        driver.findElement(By.xpath("//form[@class='formContainer']//button[@type='submit']")).click();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
