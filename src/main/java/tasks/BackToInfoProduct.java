package tasks;

import actions.Click;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.ModalProductsPage;

public class BackToInfoProduct {
    public static void backToInfoProduct(WebDriver webDriver)  {

        WaitUntilElement.isPresent(webDriver, ModalProductsPage.keepBuyingButton);
        Click.on(webDriver, ModalProductsPage.keepBuyingButton);

    }
}
