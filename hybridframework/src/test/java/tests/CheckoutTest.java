package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.InventoryPage;
import pages.CartPage;
import pages.CheckoutPage;
import utils.ConfigReader;

public class CheckoutTest extends BaseTest {

    @Test
    public void checkoutTest() {

        LoginPage lp = new LoginPage();

        lp.login(
            ConfigReader.get("username"),
            ConfigReader.get("password")
        );

        new InventoryPage().addItem();
        new CartPage().openCart();
        new CheckoutPage().checkout();
    }
}