package util;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.BasePage;

public class Util  {

    //public Util(WebDriver webDriver) {
        //super(webDriver);
    //}

    public static boolean scrollToElement(WebDriver webDriver, WebElement element) {
        try {
            ((JavascriptExecutor) webDriver ).executeScript("arguments[0].scrollIntoView(true)", element);
            return true;

        } catch (Exception e) {
            return false;
        }
    }

}
