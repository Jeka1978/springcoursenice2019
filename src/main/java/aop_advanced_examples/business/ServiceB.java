package aop_advanced_examples.business;

import aop_advanced_examples.DBException;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class ServiceB {
    public void doB(){
        System.out.println("Bbbbbbbbb");
        throw new DBException("database in fire!!!");
    }
}
