package capabilitiesFactory;

import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import utils.PropertiesReader;

import java.net.MalformedURLException;
import java.net.URL;

public class CapabilitiesFactory {

    public static DesiredCapabilities getCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        System.out.printf("%s %s %s\n",
            PropertiesReader.getPlatformName(),
            PropertiesReader.getDeviceName(),
            PropertiesReader.getUdid()
        );
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, PropertiesReader.getPlatformName());
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, PropertiesReader.getDeviceName());
        capabilities.setCapability(MobileCapabilityType.UDID, PropertiesReader.getUdid());
        capabilities.setCapability("appPackage", PropertiesReader.getAppPackage());
        capabilities.setCapability("appActivity", PropertiesReader.getAppActivity());
        capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, PropertiesReader.getCommandTimeout());
        return capabilities;
    }

    public static URL getAppiumServerURL() {
        try {
            return new URL("http://0.0.0.0:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
