package tasks;

import actions.GetAttribute;
import actions.GetText;
import org.openqa.selenium.WebDriver;
import pages.HomeFalabellaPage;
import pages.InfoProductPage;

public class ObtainQuantityProducts {
    public static String obtainQuantity(WebDriver webDriver){
        return GetAttribute.get(webDriver, HomeFalabellaPage.bagIcon,"data-count");
    }

}

