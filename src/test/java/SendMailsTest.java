import businessObjects.GmailBO;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.PropertiesReader;

import java.util.Date;

public class SendMailsTest extends BaseTest {

    private final GmailBO gmailBO = new GmailBO();
    private final String recipient = PropertiesReader.getMailRecipient();
    private String subject = PropertiesReader.getMailSubject();
    private final String body = PropertiesReader.getMailBody();

    @Test
    public void givenNewMail_whenSent_thenAppearedInTheInbox () throws InterruptedException {
        System.out.printf("%s %s %s\n", recipient, subject, body);
        subject += " " + new Date();
        gmailBO
            .skipInitialPage()
            .sendLetter(recipient, subject, body)
            .openSentLetters();
        Assert.assertTrue(gmailBO.isLetterSent(subject));
    }
}
