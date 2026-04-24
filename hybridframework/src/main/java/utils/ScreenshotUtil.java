package utils;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class ScreenshotUtil {

    public static void capture(String testName) {

        try {

            File src = ((TakesScreenshot) DriverFactory.getDriver())
                    .getScreenshotAs(OutputType.FILE);

            File dest = new File("screenshots/" + testName + ".png");

            FileUtils.copyFile(src, dest);

        } catch (Exception e) {
            System.out.println("Screenshot failed");
        }
    }
}