package never_use_switch_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Service
public class MailInfoMockProducer {
   private Random random = new Random();

    @Autowired
    private MailSender mailSender;

    @Scheduled(fixedDelay = 1000)
    public void generateStamMailInfo() {

        int i = random.nextInt(3) + 1;
        MailInfo mailInfo = new MailInfo(i);
        mailSender.sendMail(mailInfo);
    }
}
