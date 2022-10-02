package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import pages.ShoppingBagPage;

public class PurchaseProduct {
    public static void purchaseProduct(WebDriver webDriver){
        Click.on(webDriver, ShoppingBagPage.buyButton);
    }
}
