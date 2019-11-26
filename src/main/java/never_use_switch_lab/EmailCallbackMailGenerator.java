package never_use_switch_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class EmailCallbackMailGenerator implements MailGenerator {
    @Override
    public String generateHtml(MailInfo mailInfo) {
        //50 lines of code
        return "<html> don't call us we call you </html>";
    }

    @Override
    public int getMyCode() {
        return 2;
    }


}
