package pages;

import org.openqa.selenium.By;
import utils.DriverFactory;

public class InventoryPage {

    By addToCart = By.id("add-to-cart-sauce-labs-backpack");

    public void addItem() {
        DriverFactory.getDriver().findElement(addToCart).click();
    }
}