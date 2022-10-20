package testngscripts;

import com.selenium.base.methodfile;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class tablescripts extends methodfile {

    String browser = "Chrome";
    String url = "https://www.espncricinfo.com/rankings/content/page/211271.html";
    String table = "(//table[@class='StoryengineTable'])[1]";

    @BeforeTest
    public void invoke(){
     browserinvoke(browser);
    }

    @Test
    public void navigateUrl() throws IOException {

        navigateUrl(url);
        takeScreenshots();
    }

    @Test
    public void tableValue() throws IOException {

        linklist(table);
        takeScreenshots();
    }

    @AfterTest
    public void close() {
        closeDriver();
    }


}
