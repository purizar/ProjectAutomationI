package tasks;

import actions.Click;
import actions.GetText;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.InfoProductPage;
import pages.ModalProductsPage;

public class CapturePriceProduct {

    public static String capturePriceProduct(WebDriver webDriver)  {

        WaitUntilElement.isPresent(webDriver, InfoProductPage.priceProduct);
        return GetText.get(webDriver, InfoProductPage.priceProduct);

    }
}
