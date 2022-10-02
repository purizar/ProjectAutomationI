package tasks;

import actions.Click;
import org.openqa.selenium.WebDriver;
import pages.ModalProductsPage;
import pages.ShoppingBagPage;

public class AddQuantityProduct {
    public static void addQuantityProduct(WebDriver webDriver){
        Click.on(webDriver, ModalProductsPage.increaseButton);
    }
}
