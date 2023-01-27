package Testcase;

import com.Baseclass.DriverInitiate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class AlertTestcase extends DriverInitiate {
    String txtString = "Good Morning";

    @BeforeTest
    public void tearUp() {
        getDriver("Chrome");

    }

    @Test
    public void popupAction() {
        navigateUrl("https://demoqa.com/alerts", driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebElement element = driver.findElement(By.xpath("//button[@id='promtButton']"));
        ((JavascriptExecutor) (driver)).executeScript("arguments[0].scrollIntoView(true)", element);
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        driver.switchTo().alert().sendKeys(txtString);
        driver.switchTo().alert().accept();
        String Str = driver.findElement(By.className("text-success")).getText();
        String txtActual = Str.replaceFirst("You entered ", "");
        System.out.println(txtString);
        System.out.println(txtActual);
        Assert.assertEquals(txtString, txtActual);

    }

    @AfterTest
    public void tearDown() {
        quit(driver);
    }
}
