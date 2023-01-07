package Testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampletest {

    public WebDriver driver;

    @BeforeTest
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    @Test
    public  void urlInit() {
        driver.navigate().to("https://www.gmail.com");
    }

    @AfterTest
    public void  quit(){
        driver.quit();
    }

}
