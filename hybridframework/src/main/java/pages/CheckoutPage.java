package pages;

import org.openqa.selenium.By;
import utils.DriverFactory;

public class CheckoutPage {

    By cart = By.id("shopping_cart_container");
    By checkout = By.id("checkout");

    public void checkout() {

        DriverFactory.getDriver().findElement(cart).click();
        DriverFactory.getDriver().findElement(checkout).click();
    }
}