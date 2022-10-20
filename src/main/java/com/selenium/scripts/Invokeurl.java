package com.selenium.scripts;

import com.selenium.base.browserInvoke;
import com.selenium.base.methodfile;
import org.openqa.selenium.WebDriver;


public class Invokeurl extends methodfile {

    public  WebDriver driver;

    public void broswsercall() {
        browserinvoke("Chrome");
        navigateUrl("https://www.espncricinfo.com/rankings/content/page/211271.html");
        linklist("(//table[@class='StoryengineTable'])[1]");
    }

    public static void main(String[] args) {
        Invokeurl ink = new Invokeurl();
        ink.broswsercall();
    }
}
