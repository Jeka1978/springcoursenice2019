package never_use_switch_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.toMap;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableScheduling
public class MainConf {



    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConf.class);
        System.out.println();
    }





}

