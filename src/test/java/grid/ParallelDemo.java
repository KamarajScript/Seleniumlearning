package grid;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

public class ParallelDemo extends BaseTest {

    @Test
    public void validCredentials() {
        getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        getDriver().findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))
                .submit();
        driver.get().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        String newPageText = getDriver().findElement(By.xpath("//h6")).getText();
        System.out.println("newPageText :" + newPageText);
        assertEquals(newPageText, "Dashboard");

    }

    @Test
    public void invalidCredentials() {

        getDriver().findElement(By.xpath("//input[@name='username']")).sendKeys("1234");
        getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("12342");
        getDriver().findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))
                .submit();
        String actualErrorMessage = getDriver()
                .findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"))
                .getText();
        System.out.println("Actual ErrorMessage :" + actualErrorMessage);
        assertEquals(actualErrorMessage, "Invalid credentials");

    }

    @Test
    public void loginPageHeading() {

        String loginText = getDriver()
                .findElement(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']")).getText();
        System.out.println("Actual loginText :" + loginText);
        assertEquals(loginText, "Login");

    }

    @Test
    public void forgotPasswordPageHeading() {

        getDriver().findElement(By.xpath("//div[@class='orangehrm-login-forgot']//p")).click();
        String forgetPasswordTitle = getDriver().findElement(By.xpath("//*[@id='content']/div[1]/div[2]/h1"))
                .getText();
        System.out.println("Actual Page Title of Forgot Password Page :" + forgetPasswordTitle);
        assertEquals(forgetPasswordTitle, "Forgot Your Password?");
    }

    @Test
    public void verifyLinkedIn() {

        Boolean linkedInIcon = getDriver().findElement(By.xpath("//*[@class='orangehrm-login-footer-sm']")).isEnabled();
        System.out.println("Actual linkedIn Text :" + linkedInIcon);
        assertTrue(linkedInIcon);

    }
}