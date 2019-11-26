package real_spring.quoters;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@PropertySource("classpath:application.properties")
@ImportResource("classpath:context.xml")
@EnableAspectJAutoProxy
public class Conf {
//
//    @Bean
//    public List<Quoter> quoters(){
//        return new ArrayList<>(asList(() -> System.out.println("this is default")));
//    }
//
//



    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Conf.class);
        System.out.println();
//        context.close();



    }
}
