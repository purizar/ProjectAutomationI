package tasks;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import actions.WriteText;
import org.openqa.selenium.WebDriver;
import pages.GooglePage;
import pages.GoogleResultsPage;
import pages.HomeFalabellaPage;

public class SearchFalabella {
    public static void search(WebDriver webDriver, String findText) throws InterruptedException {

        WaitUntilElement.isPresent(webDriver,HomeFalabellaPage.searchInput);
        WriteText.text(webDriver, HomeFalabellaPage.searchInput, findText);
        Enter.enter(webDriver, HomeFalabellaPage.searchInput);

     }
}
