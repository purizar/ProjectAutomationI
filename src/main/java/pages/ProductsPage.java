package pages;

import org.openqa.selenium.By;

public class ProductsPage {
    public static By product(String producto){
        return By.xpath("(//b[contains(text(),'"+producto+"')]/ancestor::a)[1]");
    }
}
