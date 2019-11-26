package never_use_switch_lab;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class MailInfoMockProducer {

    private MailSender mailSender;

    //this method shoud run every second
    public void generateStamMailInfo() {
        Random random = new Random();
        int i = random.nextInt(2) + 1;
        MailInfo mailInfo = new MailInfo(i);
        mailSender.sendMail(mailInfo);
    }
}
