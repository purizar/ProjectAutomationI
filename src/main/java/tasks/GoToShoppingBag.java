package tasks;

import actions.Click;
import actions.MoveToElement;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import pages.HomeFalabellaPage;
import pages.ModalProductsPage;

public class GoToShoppingBag {
    public static void goToShoppingBag(WebDriver webDriver)  {

        WaitUntilElement.isPresent(webDriver, HomeFalabellaPage.bagLink);
        Click.on(webDriver, HomeFalabellaPage.bagLink);

    }
}
