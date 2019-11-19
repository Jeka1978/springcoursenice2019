package real_spring.quoters;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
@Component
public class TalkingRobot {
    private final List<Quoter> quoters;

    @Autowired
    public TalkingRobot(List<Quoter> quoters) {
        this.quoters = quoters;
    }

    @PostConstruct
    public void talk(){
        quoters.forEach(Quoter::sayQuote);
    }
}
