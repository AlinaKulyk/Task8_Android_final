package pageObjects;

import driver.AndroidDriverSingletone;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePO {

    protected AndroidDriver driver;

    public BasePO() {
        driver = AndroidDriverSingletone.getDriver();
        PageFactory.initElements(driver, this);
    }
}
