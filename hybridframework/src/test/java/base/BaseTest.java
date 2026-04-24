package base;

import org.testng.annotations.*;

import utils.*;

public class BaseTest {

@BeforeMethod
public void setup(){

DriverFactory.initDriver();

DriverFactory.getDriver()
.get(ConfigReader.get("url"));
}

@AfterMethod
public void tearDown(){

DriverFactory.quitDriver();
}
}