package tasks;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import actions.WriteText;
import org.openqa.selenium.WebDriver;
import pages.HomeFalabellaPage;
import pages.ProductsPage;
import util.Util;

public class SelectProduct {

    public static void selectProduct(WebDriver webDriver, String product) throws InterruptedException {

        WaitUntilElement.isPresent(webDriver, ProductsPage.product(product));
        Click.on(webDriver, ProductsPage.product(product));

    }
}
