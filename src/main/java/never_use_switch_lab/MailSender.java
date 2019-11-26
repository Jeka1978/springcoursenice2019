package never_use_switch_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
public class MailSender {

    @Autowired
    private Map<String,MailGenerator> map;


    public void sendMail(MailInfo mailInfo) {

        String mailCode = String.valueOf(mailInfo.getMailCode());
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new IllegalStateException(mailCode + " not supported yet");
        }
        String html = mailGenerator.generateHtml(mailInfo);
        send(html);

    }

    private void send(String html) {
        System.out.println(html+" was sent");
    }

}
