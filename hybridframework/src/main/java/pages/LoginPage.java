package pages;

import org.openqa.selenium.By;
import utils.DriverFactory;

public class LoginPage {

    By user = By.id("user-name");
    By pass = By.id("password");
    By login = By.id("login-button");

    public void login(String u,String p) {

        DriverFactory.getDriver().findElement(user).sendKeys(u);
        DriverFactory.getDriver().findElement(pass).sendKeys(p);
        DriverFactory.getDriver().findElement(login).click();
    }
}
