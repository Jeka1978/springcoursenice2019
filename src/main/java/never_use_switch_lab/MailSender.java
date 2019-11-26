package never_use_switch_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Service
public class MailSender {




    private Map<Integer, MailGenerator> map = new HashMap<>();

    public void registerMailGenerator(int code,MailGenerator mailGenerator){
        map.putIfAbsent(code, mailGenerator);
    }



    public void sendMail(MailInfo mailInfo) {

        int mailCode = mailInfo.getMailCode();
        MailGenerator mailGenerator = map.get(mailCode);
        if (mailGenerator == null) {
            throw new IllegalStateException(mailCode + " not supported yet");
        }
        String html = mailGenerator.generateHtml(mailInfo);
        send(html);

    }

    private void send(String html) {
        System.out.println(html + " was sent");
    }

}
