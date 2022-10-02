package tasks;

import actions.GetText;
import org.openqa.selenium.WebDriver;
import pages.InfoProductPage;
import pages.ModalProductsPage;

public class ObtainTitle {
    public static String obtainTitle(WebDriver webDriver, String product){
        return GetText.get(webDriver, InfoProductPage.titleProduct(product));
    }

}
