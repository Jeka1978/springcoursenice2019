package real_spring.quoters;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Nice
@Order(1)
public class TerminatorQuoter implements Quoter {

    private List<String> messages;

    @PostConstruct
    public void init(){
        System.out.println("terminator was built");
    }

    @Value("${terminator}")
    public void setMessages(String[] message) {
        this.messages = asList(message);
    }

    @Override
    public void sayQuote() {
        messages.forEach(System.out::println);
    }

    @PreDestroy
    public void killAll(){
        new Thread(() -> System.out.println("you are terminated...")).start();

    }










}
