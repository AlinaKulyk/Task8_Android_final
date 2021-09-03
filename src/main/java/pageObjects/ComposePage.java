package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ComposePage extends BasePO {

    @FindBy(id = "com.google.android.gm:id/to")
    private WebElement toInput;
    @FindBy(id = "com.google.android.gm:id/subject")
    private WebElement subjectInput;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.webkit.WebView/android.webkit.WebView/android.widget.EditText")
    private WebElement bodyInput;
    /* @FindBy(id="android:id/button1")
    private WebElement gotItBtn; */
    @FindBy(id = "com.google.android.gm:id/send")
    private WebElement sendBtn;

    public ComposePage typeRecipient(String recipient) {
        toInput.sendKeys(recipient);
        return new ComposePage();
    }

    public ComposePage typeSubject(String subject) {
        subjectInput.sendKeys(subject);
        return new ComposePage();
    }

    public ComposePage typeBody(String body) {
        bodyInput.sendKeys(body);
        return new ComposePage();
    }

    public ComposePage clickGotItBtn() {
        try {
            WebElement gotItBtn =
                    driver.findElement(By.id("android:id/button1"));
            if (gotItBtn != null) {
                gotItBtn.click();
            }
        } catch (Exception ignored) {
        }
        return new ComposePage();
    }

    public IncomeLettersPage clickSendBtn() {
        sendBtn.click();
        return new IncomeLettersPage();
    }
}
