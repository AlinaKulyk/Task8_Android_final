package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SentLettersPage extends BasePO {

    /* @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3]")
    private WebElement lastSentLetterTextView; */

    public boolean isSentLetterDisplayed(String subject) {
        WebElement lastSentLetterTextView = null;
        try {
            lastSentLetterTextView =
                    // driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3][@text='" + subject + "']"));
                    driver.findElement(By.xpath(String.format("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3][@text='%s']", subject)));
        } catch (Exception ignored) {
        }
        return lastSentLetterTextView != null;
    }
}
