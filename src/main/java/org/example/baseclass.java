package org.example;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;


public class baseclass {
    public static AppiumDriver driver;

    @BeforeClass
    public void SetupApplication() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();
        // your mobile phone details
        caps.setCapability("appium:deviceName", "Earl's Galaxy S20 5G");
        caps.setCapability("platformName", "android");
        caps.setCapability("appium:automationName", "uiautomator2");
        caps.setCapability("appium:platformVersion", "13.0");
        caps.setCapability("appium:appPackage", "com.fivemobile.thescore");
        caps.setCapability("appium:appActivity", "com.fivemobile.thescore.ui.MainActivity");
        caps.setCapability("autoAcceptAlerts", "true");
        //caps.setCapability("noReset", "true");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), caps);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    @AfterClass
    public void CloseApplication() throws MalformedURLException {
        driver.quit();
    }
}
