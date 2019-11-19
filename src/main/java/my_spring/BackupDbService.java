package my_spring;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */

public class BackupDbService {

    @Scheduled(fixedDelay = 1000)
    public void doBackup(){
        System.out.println("backpuing,,,,");
    }
}
