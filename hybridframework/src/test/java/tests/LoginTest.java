package tests;

import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import utils.ConfigReader;

public class LoginTest extends BaseTest {

    @Test
    public void loginTest() {

        LoginPage lp = new LoginPage();

        lp.login(
                ConfigReader.get("username"),
                ConfigReader.get("password")
        );
    }
}