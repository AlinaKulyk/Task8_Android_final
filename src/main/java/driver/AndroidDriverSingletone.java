package driver;

import capabilitiesFactory.CapabilitiesFactory;
import com.sun.jdi.connect.spi.TransportService;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class AndroidDriverSingletone {

    private static AndroidDriver driver;

    private AndroidDriverSingletone() {}

    public static AndroidDriver getDriver() {
        if (driver == null) {
            driver = new AndroidDriver(
                Objects.requireNonNull(CapabilitiesFactory.getAppiumServerURL()),
                CapabilitiesFactory.getCapabilities()
            );
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }

    public static void quitDriver() {
        driver.quit();
    }
}
