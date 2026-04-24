package pages;

import org.openqa.selenium.By;
import utils.DriverFactory;

public class CartPage {

    By cart = By.className("shopping_cart_link");

    public void openCart() {
        DriverFactory.getDriver().findElement(cart).click();
    }
}