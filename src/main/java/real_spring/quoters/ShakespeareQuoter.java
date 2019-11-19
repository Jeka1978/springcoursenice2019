package real_spring.quoters;

import my_spring.InjectRandomInt;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Component
@Order(2)
public class ShakespeareQuoter implements Quoter {

    @InjectRandomInt(min = 3, max = 7)
    private int repeat;

    @Value("${shake}")
    private String message;


    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println(message);
        }
    }
}





