package qulifiers_example;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@NiceRepo(DBType.MONGO)

public class MongoImpl implements Dao {
    @Override
    public void saveAll() {
        System.out.println("saved to Mongo");
    }
}
