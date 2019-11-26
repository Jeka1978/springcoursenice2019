package qulifiers_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import static qulifiers_example.DBType.*;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainService {

    @NiceRepo(MONGO)
    private Dao mainDao;

    @NiceRepo(ORACLE)
    private Dao backupDao;

    @Scheduled(fixedDelay = 1000)
    public void work(){
        mainDao.saveAll();
    }

    @Scheduled(fixedDelay = 3000)
    public void backup(){
        backupDao.saveAll();
    }
}
