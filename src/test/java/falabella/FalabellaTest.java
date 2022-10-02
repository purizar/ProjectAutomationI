package falabella;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import tasks.*;

public class FalabellaTest extends BaseTest {

    @Test
    public void buyProductFalabella() throws InterruptedException {
        String product = "Monitor Samsung 22 pulgadas";
        //Busqueda google
        SearchGoogle.search(webDriver,"Falabella Colombia");
        String urlCurrent= webDriver.getCurrentUrl();
        String urlExpected= "https://www.falabella.com.co/falabella-co";
        Assert.assertEquals(urlCurrent, urlExpected);
        //Busqueda Falabella HomePage
        SearchFalabella.search(webDriver,product);
        SelectProduct.selectProduct(webDriver, product);
        String titleCurrent = ObtainTitle.obtainTitle(webDriver, product);
        Assert.assertEquals(titleCurrent, product);
        //Informacion detallada del producto
        String priceProductExpected = CapturePriceProduct.capturePriceProduct(webDriver);
        AddWarranty.AddWarrantyExtend(webDriver);
        AddProductToBag.AddProduct(webDriver);
        //Modal del producto
        String priceProductModal = ObtainPriceModal.capturePriceProduct(webDriver);
        Assert.assertEquals(priceProductExpected,priceProductModal);
        AddQuantityProduct.addQuantityProduct(webDriver); //+1
        BackToInfoProduct.backToInfoProduct(webDriver); //Seguir comprando
        //Icono ir a la bolsa de compras
        String quantityProductsExpected = "2";
        String quantityProductsCurrent = ObtainQuantityProducts.obtainQuantity(webDriver);
        Assert.assertEquals(quantityProductsCurrent, quantityProductsExpected);

    }
}
