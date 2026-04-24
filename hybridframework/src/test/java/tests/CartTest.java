package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import pages.InventoryPage;
import utils.ConfigReader;

public class CartTest extends BaseTest {

    @Test
    public void cartTest() {

        LoginPage lp = new LoginPage();

        lp.login(
                ConfigReader.get("username"),
                ConfigReader.get("password"));

        InventoryPage ip = new InventoryPage();
        ip.addItem();
    }
}