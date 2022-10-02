package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GetText {
    public static String get(WebDriver webDriver, By locator){
        return webDriver.findElement(locator).getText();
    }
}
