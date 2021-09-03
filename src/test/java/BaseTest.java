import driver.AndroidDriverSingletone;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utils.PropertiesReader;

public abstract class BaseTest {
    public BaseTest() {
        PropertiesReader.init();
    }
    @AfterSuite
    public void test(){
        AndroidDriverSingletone.quitDriver();
    }
}
