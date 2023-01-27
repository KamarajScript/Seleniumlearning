package Testcase;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class withoutSampletest {

    public WebDriver driver;

    @BeforeTest
    public void initialize() {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
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
