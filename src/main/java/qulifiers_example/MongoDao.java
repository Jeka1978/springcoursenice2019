package qulifiers_example;

import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */
@NiceRepo(DBType.MONGO)
public class MongoDao implements Dao {
    @Override
    public void saveAll() {
        System.out.println("saved to Mongo");
    }
}
