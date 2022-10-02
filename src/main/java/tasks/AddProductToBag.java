package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import pages.InfoProductPage;

public class AddProductToBag {

    public static void AddProduct(WebDriver webDriver) {
        Click.on(webDriver,InfoProductPage.addProductButton);
    }
}
