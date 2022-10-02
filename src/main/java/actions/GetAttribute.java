package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetAttribute {
    public static String get(WebDriver webDriver, By locator, String attribute){
        return webDriver.findElement(locator).getAttribute(attribute);
    }
}
