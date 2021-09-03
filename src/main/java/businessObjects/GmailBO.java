package businessObjects;

import pageObjects.BasePO;
import pageObjects.IncomeLettersPage;
import pageObjects.InitialPage;
import pageObjects.SentLettersPage;

public class GmailBO {

    private BasePO currentPage;

    public GmailBO() {
        this.currentPage = new InitialPage();
    }

    public GmailBO skipInitialPage() {
        this.currentPage =
                ((InitialPage) this.currentPage)
                        .clickGotItBtn()
                        .clickOkBtn()
                        .clickTakeMeToGmailBtn();
        return this;
    }

    public GmailBO sendLetter(String recipient, String subject, String body) {
        this.currentPage =
                ((IncomeLettersPage) this.currentPage)
                        .clickComposeBtn()
                        .clickGotItBtn()
                        .typeRecipient(recipient)
                        .typeSubject(subject)
                        .typeBody(body)
                        .clickSendBtn();
        return this;
    }

    public GmailBO openSentLetters() {
        this.currentPage =
                ((IncomeLettersPage) this.currentPage)
                        .clickNavDrawerBtn()
                        .clickSentBtn();
        return this;
    }

    public boolean isLetterSent(String subject) throws InterruptedException {
        return ((SentLettersPage) this.currentPage).isSentLetterDisplayed(subject);
    }
}
