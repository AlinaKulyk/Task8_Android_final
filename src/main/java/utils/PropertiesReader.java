package utils;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Logger;

public class PropertiesReader {

    private static final Properties property = new Properties();

    public static void init() {
        FileInputStream fis;
        try {
            fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
            fis.close();
        } catch (IOException e) {
            System.err.println("ERROR: Properties file is not exist!");
        }
    }

    public static String getPlatformName() {
        return property.getProperty("platform.name");
    }

    public static String getDeviceName() {
        return property.getProperty("device.name");
    }

    public static String getUdid() {
        return property.getProperty("udid");
    }

    public static String getAppPackage() {
        return property.getProperty("app.package");
    }

    public static String getAppActivity() {
        return property.getProperty("app.activity");
    }

    public static String getCommandTimeout() {
        return property.getProperty("command.timeout");
    }

    public static String getMailRecipient() {
        return property.getProperty("mail.recipient");
    }

    public static String getMailSubject() {
        return property.getProperty("mail.subject");
    }

    public static String getMailBody() {
        return property.getProperty("mail.body");
    }
}