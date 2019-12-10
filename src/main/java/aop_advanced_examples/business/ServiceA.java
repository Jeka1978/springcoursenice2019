package aop_advanced_examples.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class ServiceA {
    @Autowired
    private ServiceB serviceB;

    @Scheduled(fixedDelay = 1)
    public void doA(){
        System.out.println("aAAA");
        serviceB.doB();
    }
}
