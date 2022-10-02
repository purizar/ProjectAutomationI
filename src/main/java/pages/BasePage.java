package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver webDriver;

    public static WebDriverWait wait;

    public BasePage(WebDriver webDriver) {

        this.webDriver = webDriver;
        wait = new WebDriverWait(this.webDriver, 60);

    }
}
