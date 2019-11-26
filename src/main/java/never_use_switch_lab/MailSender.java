package never_use_switch_lab;

/**
 * @author Evgeny Borisov
 */
public class MailSender {

    public void sendMail(MailInfo mailInfo) {
        if (mailInfo.getMailCode() == 1) {
            //50 lines of code which generate Welcome mail
            System.out.println("Welcome mail was sent");
        } else if (mailInfo.getMailCode() == 2) {
            //60 lines of code which generate Welcome mail
            System.out.println("don't call us we call was sent");
        }
    }

}
