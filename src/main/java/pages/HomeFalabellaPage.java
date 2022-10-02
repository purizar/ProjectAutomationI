package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Util;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomeFalabellaPage {

    public static By searchInput = By.id("testId-SearchBar-Input");
    public static By bagLink = By.xpath("//li[@id='testId-UserAction-basket']/div/a");
    public static By bagIcon = By.xpath("//li[@id='testId-UserAction-basket']/div/a/i");
}
