package never_use_switch_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
public interface MailGenerator {
    String generateHtml(MailInfo mailInfo);
    int getMyCode();

    @Scheduled(fixedDelay = 100)
    default void init(){
        System.out.println("I was created!!!");
    }


    @Autowired
    default void registerMyselfAsMailGenerator(MailSender mailSender) {
        mailSender.registerMailGenerator(getMyCode(),this);
    }



}
