package never_use_switch_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Evgeny Borisov
 */
@Service
public class MyServiceImpl implements MyService {


    private Helper helper;

    @Autowired
    public void setHelper(Helper helper) {
        this.helper = helper;
    }
}
