package never_use_switch_lab;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class WelcomeMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        //50 lines of code
        return "<html> Welcome new client </html>";
    }

    @Override
    public int getMyCode() {
        return 1;
    }
}
