package com.selenium.base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.logging.FileHandler;

public class methodfile extends  browserInvoke {

    public void navigateUrl(String inputData) {
        driver.navigate().to(inputData);
    }

    public void linklist(String inputData) {
        WebElement htmltable=driver.findElement(By.xpath(inputData));
        List<WebElement> columns=htmltable.findElements(By.tagName("th"));
        System.out.println("Number of columns:"+columns.size());
        List<WebElement> rows=htmltable.findElements(By.tagName("tr"));
        System.out.println("Number of rows:"+rows.size());
        for(int rnum=0;rnum<rows.size();rnum++)
            {
                System.out.println(rows.get(rnum).getText());
            }
        }

     public void takeScreenshots() throws IOException {
         File Screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(Screen,new File("D://outfile.png"));
     }
}
