package pages;

import org.openqa.selenium.By;

public class InfoProductPage {


    public static By extendWarranty = By.id("testId-warranty-option-btn-2-años de");
    public static By addProductButton = By.xpath("//div[@id= 'buttonForCustomers']//button");
    public static By priceProduct = By.xpath("//span[@class='copy13 primary high jsx-3548557188 normal      ']");

    public static By titleProduct(String product){
        return By.xpath("//div[contains(text(),'"+product+"')]");
    }


}
