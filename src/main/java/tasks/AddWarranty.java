package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import pages.InfoProductPage;

public class AddWarranty {
    public static void AddWarrantyExtend(WebDriver webDriver) {
        Click.on(webDriver, InfoProductPage.extendWarranty);
    }
}
