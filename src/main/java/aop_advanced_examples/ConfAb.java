package aop_advanced_examples;

import aop_advanced_examples.business.ServiceA;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableAspectJAutoProxy
@EnableScheduling
public class ConfAb {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfAb.class);
        ServiceA serviceA = context.getBean(ServiceA.class);
        try {
            serviceA.doA();
        } catch (Exception e) {
            System.out.println("Huston, we have a problem, but it is handled, we just loose some time");
        }
    }
}
