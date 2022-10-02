package tasks;

import actions.GetText;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.InfoProductPage;
import pages.ModalProductsPage;

public class ObtainPriceModal {

    public static String capturePriceProduct(WebDriver webDriver)  {

        WaitUntilElement.isPresent(webDriver, ModalProductsPage.priceProduct);
        return GetText.get(webDriver, ModalProductsPage.priceProduct);

    }
}
