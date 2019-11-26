package never_use_switch_lab;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
//@Component
public class NewBeanRegistry {
    @Autowired
    private GenericApplicationContext context;


//    public void registerBean() {
//        context.registerBean();
//    }
}
