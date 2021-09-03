package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.Awaiters;

public class InitialPage extends BasePO {

    /* @FindBy(id = "com.google.android.gm:id/welcome_tour_got_it")
    private WebElement gotItBtn; */
    /* @FindBy(id = "com.google.android.gm:id/action_done")
    private WebElement takeMeToGmailBtn; */

    public InitialPage clickGotItBtn() {
        try {
            WebElement gotItBtn =
                    driver.findElement(By.id("com.google.android.gm:id/welcome_tour_got_it"));
            if (gotItBtn != null) {
                gotItBtn.click();
            }
        } catch (Exception ignored) {
        }
        return new InitialPage();
    }

    public InitialPage clickOkBtn() {
        try {
            WebElement okBtn =
                    driver.findElement(By.xpath("//android.widget.TextView[@text='OK']"));
            okBtn.click();
        } catch (Exception ignored) {
        }
        return this;
    }

    public IncomeLettersPage clickTakeMeToGmailBtn() {
        try {
            Awaiters.waitForAppear(
                    driver,
                    By.id("com.google.android.gm:id/owner")
            );
            WebElement takeMeToGmailBtn =
                    driver.findElement(By.id("com.google.android.gm:id/action_done"));
            if (takeMeToGmailBtn != null) {
                takeMeToGmailBtn.click();
            }
        } catch (Exception ignored) {
        }
        return new IncomeLettersPage();
    }
}
