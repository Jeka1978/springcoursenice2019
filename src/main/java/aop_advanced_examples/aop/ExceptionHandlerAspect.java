package aop_advanced_examples.aop;

import aop_advanced_examples.DBException;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author Evgeny Borisov
 */
@Aspect
@Component
@PropertySource("classpath:mail.properties")
public class ExceptionHandlerAspect {
    @Value("${dbaMails}")
    private String[] mails;

    private Map<DBException,Void> cache = new WeakHashMap<>();


    @Pointcut("execution(* aop_advanced_examples.business..*.*(..))")
    public void businessMethods(){}


    @AfterThrowing(pointcut = "businessMethods()",throwing = "ex")
    public void allBusinessMethods(DBException ex){
        if(!cache.containsKey(ex))
//        Arrays.stream(mails).forEach(s -> {
//            System.out.println("Sending to "+s);
//            System.out.println(ex.getMessage());
//        });
        cache.putIfAbsent(ex,null);
    }

}
