package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Enter {
    public static void enter(WebDriver webDriver, By locator){
        webDriver.findElement(locator).sendKeys(Keys.ENTER);
    }
}
