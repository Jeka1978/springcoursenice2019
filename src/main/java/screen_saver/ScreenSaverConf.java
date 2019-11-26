package screen_saver;

import lombok.SneakyThrows;
import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
//@ImportResource("classpath:context.xml")
public class ScreenSaverConf {


    @Bean
    @Scope(value = "prototype")
    public Color color(){
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }













    @SneakyThrows
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScreenSaverConf.class);
        while (true) {
            ColorFrame bean = context.getBean(ColorFrame.class);
            System.out.println("bean.getClass() = " + bean.getClass());
            bean.moveToRandomLocation();
            Thread.sleep(80);
        }
    }
}



