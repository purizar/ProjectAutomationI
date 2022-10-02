package tasks;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import actions.WriteText;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import pages.GooglePage;
import pages.GoogleResultsPage;

public class SearchGoogle {
    public static void search(WebDriver webDriver, String findText) throws InterruptedException {

        WriteText.text(webDriver, GooglePage.inputTextSearch, findText);
        Enter.enter(webDriver, GooglePage.inputTextSearch);
        WaitUntilElement.isPresent(webDriver, GoogleResultsPage.linkFalabella);
        Click.on(webDriver, GoogleResultsPage.linkFalabella);

    }
}
