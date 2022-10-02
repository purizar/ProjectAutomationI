package actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class IsDisplayed {
    public static boolean element(WebDriver webDriver, WebElement element){
        return element.isDisplayed();
    }
}
