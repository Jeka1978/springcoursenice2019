package qulifiers_example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Evgeny Borisov
 */

@NiceRepo(DBType.ORACLE)
public class OracleDao implements Dao {
    @Override
    public void saveAll() {
        System.out.println("saved to Oracle");
    }
}
