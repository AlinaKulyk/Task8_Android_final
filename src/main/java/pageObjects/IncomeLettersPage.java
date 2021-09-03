package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IncomeLettersPage extends BasePO {

    @FindBy(id = "com.google.android.gm:id/compose_button")
    private WebElement composeBtn;
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc='Open navigation drawer']")
    private WebElement navDrawerBtn;
    @FindBy(xpath = "//android.widget.LinearLayout//android.widget.TextView[@text='Sent']")
    private WebElement sentBtn;

    public ComposePage clickComposeBtn() {
        composeBtn.click();
        return new ComposePage();
    }

    public IncomeLettersPage clickNavDrawerBtn() {
        navDrawerBtn.click();
        return new IncomeLettersPage();
    }

    public SentLettersPage clickSentBtn() {
        sentBtn.click();
        return new SentLettersPage();
    }
}
